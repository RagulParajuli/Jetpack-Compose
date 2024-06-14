# Android Application Overview

## 1. MainActivity
- **Main Entry Point:** The main entry point of the Android application.
  - **Extends:** `ComponentActivity`.
  - **onCreate Method:** Sets the content of the activity using a composable function wrapped in a theme (`TestTheme`), which contains `DiffColor`.

## 2. DiffColor Composable Function
- **UI Definition:** Defines the UI to be displayed.
  - **Vertical Arrangement:** Uses a `Column` to arrange the elements vertically.
  - **Column Modifier:**
    - Sets the height to 50% of the available space (`fillMaxHeight(0.5f)`).
    - Fills the width and applies multiple nested paddings and borders with different colors.
  - **Text Centering:**
    - Horizontally: `horizontalAlignment = Alignment.CenterHorizontally`
    - Vertically: `verticalArrangement = Arrangement.Center`
  - **Text Composables:** Displays the names "Ragul" and "Parajuli" with specific offsets.
    - The first `Text` composable has an offset of `(0.dp, 10.dp)`.
    - The second `Text` composable has an offset of `(20.dp, 0.dp)`.

## 3. DiffColorPreview
- **Preview Function:** A preview function to visualize the composable in Android Studio.
  - **@Preview Annotation:** Uses the `@Preview` annotation to enable previewing.
  - **Surface Wrapper:** Wraps the `DiffColor` composable in a `Surface` with a full-size modifier (`Modifier.fillMaxSize()`).

## 4. Key Points
- **Modifier:** Used to modify the appearance and layout of composables.
- **fillMaxHeight and fillMaxWidth:** Set the height and width of a composable.
- **padding:** Adds padding around a composable.
- **background:** Sets the background color of a composable.
- **border:** Adds a border around a composable.
- **Column:** A composable that arranges its children in a vertical sequence.
- **Alignment.CenterHorizontally and Arrangement.Center:** Center-align the contents horizontally and vertically, respectively.
- **Text:** Displays text with customizable properties.
- **offset:** Offsets the position of a composable.
- **Spacer:** Adds space between composables.
- **@Preview:** Allows you to preview the composable in Android Studio without running the app on a device/emulator.
- **TestTheme:** A custom theme wrapper (assuming it is defined elsewhere in the project).

This setup demonstrates the use of modifiers to apply multiple layers of padding and borders to a `Column`, with text elements centered and offset within it.
