package com.inanutshellglobal.alwahabjetpack.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inanutshellglobal.alwahabjetpack.Composables.Announcement
import com.inanutshellglobal.alwahabjetpack.models.Student
import com.inanutshellglobal.alwahabjetpack.repository.StudentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnnouncementsViewModel @Inject constructor(private val repository : StudentRepository) : ViewModel() {

    val announcements: StateFlow<List<Announcement>>
        get() = repository.announcements

    init {
        viewModelScope.launch {
            repository.getAnnouncements()
        }
    }
}