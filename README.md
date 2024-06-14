# Android Application Overview

## 1. MainActivity
- **Main Entry Point:** The main entry point of the Android application.
  - **Extends:** `ComponentActivity`.
  - **onCreate Method:** Sets the content of the activity using a composable function to display a `Box` with styled text.
  - **FontFamily:** Defines a custom font family.
    - **Font Creation:** `FontFamily` is created with a specific font (`R.font.bungeespice_regular`) and a bold weight (`FontWeight.Bold`).

## 2. Composable Content
- **Box Composable:** Provides a container for the text.
  - **Styling:** The `Box` is styled to fill the entire screen (`fillMaxSize()`), have a background color (`Color(0x9D6B2C76)`), and padding (`10.dp`).
- **Text Composable:** Displays the styled text inside the `Box`.
  - **buildAnnotatedString:** Used to style parts of the text differently.
  - **SpanStyle:** Applies different styles using `SpanStyle` within `withStyle` blocks.
  - **Text Properties:** Sets the text color, font size, font family, font style, text alignment, and text decoration.

## 3. Key Points
- **FontFamily:** Defines a custom font to be used in the application.
- **Box:** A composable that allows stacking its children and applying background color and padding.
- **Text:** Displays text with various styles and decorations.
- **buildAnnotatedString:** Constructs a styled string with different styles for different parts of the text.
- **SpanStyle:** Defines styles for parts of the text.
- **withStyle:** Applies a style to a specific part of the text.
- **Modifier:** Used to modify the appearance and layout of composables.
- **Color:** A class representing colors in the UI.
- **FontWeight:** Represents the weight of the font (e.g., bold).
- **FontStyle:** Represents the style of the font (e.g., italic).
- **TextAlign:** Represents the alignment of the text (e.g., center).
- **TextDecoration:** Represents text decorations (e.g., underline).

This setup allows the application to display a styled text with custom fonts and decorations inside a `Box` composable, providing a visually appealing UI.
