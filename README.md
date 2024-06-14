# Android Application Overview

## 1. MainActivity
- **Main Entry Point:** The main entry point of the Android application.
- **Extends:** `ComponentActivity`.
- **onCreate Method:** Sets the content of the activity using a composable function `Name`.

## 2. Name Composable Function
- **UI Definition:** Defines the UI to be displayed.
- **Vertical Arrangement:** Uses a `Column` to arrange the elements vertically.
- **Column Modifier:** Fills the entire available size (`fillMaxSize`) and sets the background color to green (`background(Color.Green)`).
- **Text Centering:**
  - Horizontally: `horizontalAlignment = Alignment.CenterHorizontally`
  - Vertically: `verticalArrangement = Arrangement.Center`
- **Text Composables:** Contains two `Text` composables to display the name "Ragul" and "Parajuli".

## 3. NamePreview
- **Preview Function:** A preview function to visualize the composable in Android Studio.
- **@Preview Annotation:** Uses the `@Preview` annotation to enable previewing.
- **Surface Wrapper:** Wraps the `Name` composable in a `Surface` with a full-size modifier (`Modifier.fillMaxSize()`).

## 4. Key Points
- **@Composable:** Marks a function as composable, meaning it can be used to describe part of a UI in Jetpack Compose.
- **Modifier:** Used to modify the appearance and layout of composables.
- **Column:** A composable that places its children in a vertical sequence.
- **Alignment.CenterHorizontally and Arrangement.Center:** Center-aligns the contents horizontally and vertically, respectively.
- **@Preview:** Allows you to preview the composable in Android Studio without running the app on a device/emulator.

