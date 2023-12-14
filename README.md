Readme for the Outdoorsy Code Challenge Android App

RecreationalVehicleSearch
Android app that allows you to search Outdoorsy RV listings by keyword.

Overview: The app is a an Android application showcasing the use of Clean Architecture and several key technologies in the Android ecosystem. It's designed to help users search for RV rentals using the Outdoorsy API.

Clean Architecture: Ensures scalability, maintainability, and testability. MVVM (Model-View-ViewModel): Used for UI-related data handling. 

Key Technologies:Jetpack Compose: Modern UI toolkit for building native interfaces. Hilt: Dependency injection framework simplifying DI in Android apps. Kotlin Coroutines: Managing background tasks with simplified code and improved performance. Retrofit & Gson: Networking and JSON serialization/deserialization. Coil: Image loading library optimized for Jetpack Compose. Timber: Logging utility for easy debugging.

Main Feature: Search Functionality - Users can search for RV rentals by keywords.

Repository Pattern: Abstracts the data layer, making network calls to fetch RV rental data.

MVVM
The OutdoorsyListingsViewModel manages UI-related data and actions for searching the RV rentals.
It uses SearchRentalListingsUseCase for the business logic that fetches the results from the API . The UI, defined in Composables such as OutdoorsyListingsScreen - glues the viewmodel and state with the actual UI elements of the screen and OutdoorsyListingsContent - holds the UI elements composables, presents the data and handles user interactions. 
The OutdoorsyListingsState holds the UI state, including search results and loading status. Actions are managed through the OutdoorsyListingsAction sealed class, linking user actions to ViewModel processing.

[RVOutdoorsyAndroidAppDemo.webm](https://github.com/Borislav91/RecreationalVehicleSearch/assets/14141206/14919a90-67b4-4ecd-a412-145127108ca0) ![OutdoorsyDemoApp](https://github.com/Borislav91/RecreationalVehicleSearch/assets/14141206/3a5d20b5-1056-45de-8647-3fa87142f87a)
