1. MainActivity:
 - The main entry point of the Android application.
 - Uses '@RequiresApi(Build.VERSION_CODES.O)' to ensure compatibility with API level 26 (Android 8.0) and above.
 - In the 'onCreate' method, it sets the content of the activity using a composable function that includes an 'ImageCard'.

2. ImageCard Composable Function:
 - Accepts a 'painter' (for the image), a 'contentDescription', a title, and a 'modifier'.
 - Uses a 'Card' composable to create a card with rounded corners and elevation.
 - Within the 'Card', a 'Box' composable is used to layer elements.
 - An 'Image' composable displays the image with cropping ('contentScale = ContentScale.Crop').
 - Another 'Box' composable is used to create a vertical gradient from transparent to black at the bottom of the image.
 - A third 'Box' composable contains the 'Text' composable that displays the title, aligned at the bottom center.

3. ImageCardPreview:
 - A preview function annotated with '@Preview' and '@RequiresApi(Build.VERSION_CODES.O)' to allow visualization of the 'ImageCard' in Android Studio.
 - It uses the same parameters to create an 'ImageCard' for the preview.
