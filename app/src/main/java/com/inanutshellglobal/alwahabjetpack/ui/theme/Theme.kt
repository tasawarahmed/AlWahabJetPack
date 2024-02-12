package com.inanutshellglobal.alwahabjetpack.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

private val LoginLightColors = lightColorScheme(
    primary = login_theme_light_primary,
    onPrimary = login_theme_light_onPrimary,
    primaryContainer = login_theme_light_primaryContainer,
    onPrimaryContainer = login_theme_light_onPrimaryContainer,
    secondary = login_theme_light_secondary,
    onSecondary = login_theme_light_onSecondary,
    secondaryContainer = login_theme_light_secondaryContainer,
    onSecondaryContainer = login_theme_light_onSecondaryContainer,
    tertiary = login_theme_light_tertiary,
    onTertiary = login_theme_light_onTertiary,
    tertiaryContainer = login_theme_light_tertiaryContainer,
    onTertiaryContainer = login_theme_light_onTertiaryContainer,
    error = login_theme_light_error,
    errorContainer = login_theme_light_errorContainer,
    onError = login_theme_light_onError,
    onErrorContainer = login_theme_light_onErrorContainer,
    background = login_theme_light_background,
    onBackground = login_theme_light_onBackground,
    surface = login_theme_light_surface,
    onSurface = login_theme_light_onSurface,
    surfaceVariant = login_theme_light_surfaceVariant,
    onSurfaceVariant = login_theme_light_onSurfaceVariant,
    outline = login_theme_light_outline,
    inverseOnSurface = login_theme_light_inverseOnSurface,
    inverseSurface = login_theme_light_inverseSurface,
    inversePrimary = login_theme_light_inversePrimary,
    surfaceTint = login_theme_light_surfaceTint,
    outlineVariant = login_theme_light_outlineVariant,
    scrim = login_theme_light_scrim,
)


private val LoginDarkColors = darkColorScheme(
    primary = login_theme_dark_primary,
    onPrimary = login_theme_dark_onPrimary,
    primaryContainer = login_theme_dark_primaryContainer,
    onPrimaryContainer = login_theme_dark_onPrimaryContainer,
    secondary = login_theme_dark_secondary,
    onSecondary = login_theme_dark_onSecondary,
    secondaryContainer = login_theme_dark_secondaryContainer,
    onSecondaryContainer = login_theme_dark_onSecondaryContainer,
    tertiary = login_theme_dark_tertiary,
    onTertiary = login_theme_dark_onTertiary,
    tertiaryContainer = login_theme_dark_tertiaryContainer,
    onTertiaryContainer = login_theme_dark_onTertiaryContainer,
    error = login_theme_dark_error,
    errorContainer = login_theme_dark_errorContainer,
    onError = login_theme_dark_onError,
    onErrorContainer = login_theme_dark_onErrorContainer,
    background = login_theme_dark_background,
    onBackground = login_theme_dark_onBackground,
    surface = login_theme_dark_surface,
    onSurface = login_theme_dark_onSurface,
    surfaceVariant = login_theme_dark_surfaceVariant,
    onSurfaceVariant = login_theme_dark_onSurfaceVariant,
    outline = login_theme_dark_outline,
    inverseOnSurface = login_theme_dark_inverseOnSurface,
    inverseSurface = login_theme_dark_inverseSurface,
    inversePrimary = login_theme_dark_inversePrimary,
    surfaceTint = login_theme_dark_surfaceTint,
    outlineVariant = login_theme_dark_outlineVariant,
    scrim = login_theme_dark_scrim,
)

private val ListLightColors = lightColorScheme(
    primary = list_theme_light_primary,
    onPrimary = list_theme_light_onPrimary,
    primaryContainer = list_theme_light_primaryContainer,
    onPrimaryContainer = list_theme_light_onPrimaryContainer,
    secondary = list_theme_light_secondary,
    onSecondary = list_theme_light_onSecondary,
    secondaryContainer = list_theme_light_secondaryContainer,
    onSecondaryContainer = list_theme_light_onSecondaryContainer,
    tertiary = list_theme_light_tertiary,
    onTertiary = list_theme_light_onTertiary,
    tertiaryContainer = list_theme_light_tertiaryContainer,
    onTertiaryContainer = list_theme_light_onTertiaryContainer,
    error = list_theme_light_error,
    errorContainer = list_theme_light_errorContainer,
    onError = list_theme_light_onError,
    onErrorContainer = list_theme_light_onErrorContainer,
    background = list_theme_light_background,
    onBackground = list_theme_light_onBackground,
    surface = list_theme_light_surface,
    onSurface = list_theme_light_onSurface,
    surfaceVariant = list_theme_light_surfaceVariant,
    onSurfaceVariant = list_theme_light_onSurfaceVariant,
    outline = list_theme_light_outline,
    inverseOnSurface = list_theme_light_inverseOnSurface,
    inverseSurface = list_theme_light_inverseSurface,
    inversePrimary = list_theme_light_inversePrimary,
    surfaceTint = list_theme_light_surfaceTint,
    outlineVariant = list_theme_light_outlineVariant,
    scrim = list_theme_light_scrim,
)


private val ListDarkColors = darkColorScheme(
    primary = list_theme_dark_primary,
    onPrimary = list_theme_dark_onPrimary,
    primaryContainer = list_theme_dark_primaryContainer,
    onPrimaryContainer = list_theme_dark_onPrimaryContainer,
    secondary = list_theme_dark_secondary,
    onSecondary = list_theme_dark_onSecondary,
    secondaryContainer = list_theme_dark_secondaryContainer,
    onSecondaryContainer = list_theme_dark_onSecondaryContainer,
    tertiary = list_theme_dark_tertiary,
    onTertiary = list_theme_dark_onTertiary,
    tertiaryContainer = list_theme_dark_tertiaryContainer,
    onTertiaryContainer = list_theme_dark_onTertiaryContainer,
    error = list_theme_dark_error,
    errorContainer = list_theme_dark_errorContainer,
    onError = list_theme_dark_onError,
    onErrorContainer = list_theme_dark_onErrorContainer,
    background = list_theme_dark_background,
    onBackground = list_theme_dark_onBackground,
    surface = list_theme_dark_surface,
    onSurface = list_theme_dark_onSurface,
    surfaceVariant = list_theme_dark_surfaceVariant,
    onSurfaceVariant = list_theme_dark_onSurfaceVariant,
    outline = list_theme_dark_outline,
    inverseOnSurface = list_theme_dark_inverseOnSurface,
    inverseSurface = list_theme_dark_inverseSurface,
    inversePrimary = list_theme_dark_inversePrimary,
    surfaceTint = list_theme_dark_surfaceTint,
    outlineVariant = list_theme_dark_outlineVariant,
    scrim = list_theme_dark_scrim,
)

private val DiaryLightColors = lightColorScheme(
    primary = diary_theme_light_primary,
    onPrimary = diary_theme_light_onPrimary,
    primaryContainer = diary_theme_light_primaryContainer,
    onPrimaryContainer = diary_theme_light_onPrimaryContainer,
    secondary = diary_theme_light_secondary,
    onSecondary = diary_theme_light_onSecondary,
    secondaryContainer = diary_theme_light_secondaryContainer,
    onSecondaryContainer = diary_theme_light_onSecondaryContainer,
    tertiary = diary_theme_light_tertiary,
    onTertiary = diary_theme_light_onTertiary,
    tertiaryContainer = diary_theme_light_tertiaryContainer,
    onTertiaryContainer = diary_theme_light_onTertiaryContainer,
    error = diary_theme_light_error,
    errorContainer = diary_theme_light_errorContainer,
    onError = diary_theme_light_onError,
    onErrorContainer = diary_theme_light_onErrorContainer,
    background = diary_theme_light_background,
    onBackground = diary_theme_light_onBackground,
    surface = diary_theme_light_surface,
    onSurface = diary_theme_light_onSurface,
    surfaceVariant = diary_theme_light_surfaceVariant,
    onSurfaceVariant = diary_theme_light_onSurfaceVariant,
    outline = diary_theme_light_outline,
    inverseOnSurface = diary_theme_light_inverseOnSurface,
    inverseSurface = diary_theme_light_inverseSurface,
    inversePrimary = diary_theme_light_inversePrimary,
    surfaceTint = diary_theme_light_surfaceTint,
    outlineVariant = diary_theme_light_outlineVariant,
    scrim = diary_theme_light_scrim,
)

private val DiaryDarkColors = darkColorScheme(
    primary = diary_theme_dark_primary,
    onPrimary = diary_theme_dark_onPrimary,
    primaryContainer = diary_theme_dark_primaryContainer,
    onPrimaryContainer = diary_theme_dark_onPrimaryContainer,
    secondary = diary_theme_dark_secondary,
    onSecondary = diary_theme_dark_onSecondary,
    secondaryContainer = diary_theme_dark_secondaryContainer,
    onSecondaryContainer = diary_theme_dark_onSecondaryContainer,
    tertiary = diary_theme_dark_tertiary,
    onTertiary = diary_theme_dark_onTertiary,
    tertiaryContainer = diary_theme_dark_tertiaryContainer,
    onTertiaryContainer = diary_theme_dark_onTertiaryContainer,
    error = diary_theme_dark_error,
    errorContainer = diary_theme_dark_errorContainer,
    onError = diary_theme_dark_onError,
    onErrorContainer = diary_theme_dark_onErrorContainer,
    background = diary_theme_dark_background,
    onBackground = diary_theme_dark_onBackground,
    surface = diary_theme_dark_surface,
    onSurface = diary_theme_dark_onSurface,
    surfaceVariant = diary_theme_dark_surfaceVariant,
    onSurfaceVariant = diary_theme_dark_onSurfaceVariant,
    outline = diary_theme_dark_outline,
    inverseOnSurface = diary_theme_dark_inverseOnSurface,
    inverseSurface = diary_theme_dark_inverseSurface,
    inversePrimary = diary_theme_dark_inversePrimary,
    surfaceTint = diary_theme_dark_surfaceTint,
    outlineVariant = diary_theme_dark_outlineVariant,
    scrim = diary_theme_dark_scrim,
)


@Composable
fun AlWahabJetPackTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            //window.statusBarColor = Color.White.toArgb()
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun AlWahabLoginTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> LoginDarkColors
        else -> LoginLightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            //window.statusBarColor = Color.White.toArgb()
            window.statusBarColor = colorScheme.primary.toArgb()
            //window.statusBarColor = login_menu_color.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun AlWahabListTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> ListDarkColors
        else -> ListLightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            //window.statusBarColor = Color.White.toArgb()
            window.statusBarColor = colorScheme.primary.toArgb()
            //window.statusBarColor = list_menu_color.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun AlWahabDetailsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DiaryDarkColors
        else -> DiaryLightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            //window.statusBarColor = Color.White.toArgb()
            window.statusBarColor = colorScheme.primary.toArgb()
            //window.statusBarColor = diary_theme_light_primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
