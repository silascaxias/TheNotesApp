# Notes App

This is an application for creating and editing notes, where each note has a title and a description. The project uses the following technologies and libraries:

## Technologies Used

- **Koin**: Dependency injection.
- **Room**: Local database for storing notes.
- **Coroutines**: Asynchronous and concurrent programming.
- **Navigation Component**: Screen navigation.
- **Lifecycle Components**: Lifecycle management with ViewModel and LiveData.

## Demo
<img src="https://github.com/user-attachments/assets/03a07864-2fda-4305-a781-814deb78f03d" width="300px" />
<img src="https://github.com/user-attachments/assets/f9e2fee4-3713-4f9a-a321-add38f148d85" width="300px" />

## Dependencies

```kotlin
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // KOIN
    implementation(libs.insert.koin.koin.android)
    // ROOM
    implementation(libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.room.ktx)
    // Navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    // Life Cycle Arch
    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)
    // Annotation processor
    ksp(libs.androidx.lifecycle.compiler)
```

## How to Run the Project

1. Clone this repository:
   ```sh
   git clone https://github.com/silascaxias/TheNotesApp.git
   ```
2. Open the project in Android Studio.
3. Sync Gradle dependencies.
4. Build and run the app on a device or emulator.

## Project Structure
- `database/`/`model/` → Contains entities and the local database using Room.
- `repository/` → Contains logic for handling notes.
- `viewmodel/` → Manages data and lifecycle using ViewModel.
- `ui/` → Contains screens and UI components.

## Features

✅ Create notes with title and description  
✅ Edit existing notes  
✅ List all notes  
✅ Delete notes  
✅ Local storage with Room  

## License

This project is under the MIT license. Feel free to contribute and improve it!

