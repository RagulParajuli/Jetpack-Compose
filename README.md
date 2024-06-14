# Android Application Overview

## 1. MainActivity
- **Main Entry Point:** The main entry point of the Android application.
- **API Level Compatibility:** Uses `@RequiresApi(Build.VERSION_CODES.O)` to ensure compatibility with API level 26 (Android 8.0) and above.
- **onCreate Method:** Sets the content of the activity using a composable function that includes an ImageCard.

## 2. ImageCard Composable Function
- **Parameters:** Accepts a `painter` (for the image), a `contentDescription`, a `title`, and a `modifier`.
- **Card Composable:** Creates a card with rounded corners and elevation using the `Card` composable.
- **Layering Elements:** Uses a `Box` composable within the `Card` to layer elements.
- **Image Display:** An `Image` composable displays the image with cropping (`contentScale = ContentScale.Crop`).
- **Vertical Gradient:** Another `Box` composable creates a vertical gradient from transparent to black at the bottom of the image.
- **Text Alignment:** A third `Box` composable contains the `Text` composable that displays the title, aligned at the bottom center.

## 3. ImageCardPreview
- **Preview Function:** Annotated with `@Preview` and `@RequiresApi(Build.VERSION_CODES.O)` to allow visualization of the ImageCard in Android Studio.
- **Parameters:** Uses the same parameters to create an `ImageCard` for the preview.

## 4. Key Points
- **@RequiresApi:** Ensures the code only runs on devices with the specified API level or higher.
- **painterResource:** Loads an image resource.
- **Card:** A composable that provides a card with customizable elevation and shape.
- **Box:** A composable that allows stacking its children.
- **Image:** Displays an image with various scaling options.
- **Brush.verticalGradient:** Creates a vertical gradient for the background.
- **Text:** Displays text with customizable style.
