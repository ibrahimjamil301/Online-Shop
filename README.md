# 🛍️ Online Shop App

An Android application that provides a smooth and modern shopping experience.  
Users can browse brands, filter products by **color** and **size**, add them to their **cart**, and manage their purchases easily.

---
## 🧠 Project Overview

This app demonstrates:
- Proper **state management** using LiveData  
- Clean separation of layers following MVVM principles  
- Integration with **Firebase** for real-time data updates  
- **Cloudinary** integration for image storage and delivery  

---

## 🚀 Features

- 🏷️ **Browse Products & Brands:** Explore a wide range of products categorized by brand.  
- 🎨 **Smart Filtering:** Filter products by color, size, or other attributes for faster navigation.  
- 🛒 **Cart Management:** Add items to your cart with real-time updates.  
- ➕ **Quantity Control:** Easily increase or decrease item quantities directly in the cart.  
- ❌ **Remove Items:** Delete unwanted products from the cart instantly.  
- 💰 **Total Calculation:** Automatically calculates the total price based on selected items and quantities.  
- ☁️ **Cloud-Based Storage:** Product images are stored on **Cloudinary** and dynamically loaded from **Firebase Realtime Database**.

---

## 🧩 Architecture

This app is built following **Clean Architecture** and **MVVM** principles to ensure scalability and maintainability.

### 🏗️ Key Components:
- **MVVM (Model–View–ViewModel)**
- **LiveData**
- **ViewModel**
- **Adapter**
- **Repository Pattern**

---
## 🧩 App Structure

```
Online_Shop/
│
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/example/androidtas/
│ │ │ │ ├── activity/                # Contains all Activities that represent app screens (UI logic)
│ │ │ │ ├── Adapter/                 # Holds RecyclerView Adapters to bind data with the UI
│ │ │ │ ├── Model/                   # Contains data models (e.g., Product, Brand) used throughout the app
│ │ │ │ ├── ViewModel/               # Contains ViewModels that manage UI-related data and interact with repositories
│ │ │ │ └── helper/                  # Includes utility and helper classes (e.g., common functions or constants)
│ │ │ │
│ │ │ ├── res/
│ │ │ │ ├── layout/                  # Contains XML layout files for UI design
│ │ │ │ │ ├── activity_cart.xml          # Layout for the Cart screen
│ │ │ │ │ ├── activity_detail.xml        # Layout for the Product Detail screen
│ │ │ │ │ ├── activity_intro.xml         # Layout for the Intro or Onboarding screen
│ │ │ │ │ ├── activity_main.xml          # Layout for the Main/Home screen
│ │ │ │ │ ├── slider_item_container.xml  # Layout for slider or banner items
│ │ │ │ │ ├── viewholder_brand.xml       # Layout for Brand item ViewHolder
│ │ │ │ │ ├── viewholder_cart.xml        # Layout for Cart item ViewHolder
│ │ │ │ │ ├── viewholder_color.xml       # Layout for Color selection ViewHolder
│ │ │ │ │ ├── viewholder_recommended.xml # Layout for Recommended product ViewHolder
│ │ │ │ │ └── viewholder_size.xml        # Layout for Size selection ViewHolder
│ │ │ │
│ │ │ └── AndroidManifest.xml            # App manifest file defining activities, permissions, and app metadata
│ │
│ ├── build.gradle.kts                   # App-level Gradle configuration
│ └── proguard-rules.pro                 # ProGuard rules for code optimization and obfuscation
│
├── gradle/                              # Gradle wrapper files
├── screenshots/                         # Folder for app screenshots (for documentation or README)
├── build.gradle.kts                     # Project-level Gradle configuration
├── settings.gradle.kts                  # Includes project modules and Gradle settings
└── gradle.properties                    # Global project properties and Gradle configs


```

---

## 🛠️ Tech Stack

| Category | Tools / Technologies |
|-----------|----------------------|
| **Language** | Kotlin |
| **UI** | XML Layouts |
| **Architecture** | MVVM, Clean Architecture |
| **Database** | Firebase Realtime Database |
| **Storage** | Cloudinary (via JSON data) |
| **Other Tools** | Android Jetpack Components |

---

## 🖼️ Screenshots

  | Intro Screen | Home Screen |
  |--------------|----------------------|
  | <img width="407" height="861" alt="1" src="https://github.com/user-attachments/assets/51b69628-aa0c-4c7c-9e9f-845cc19bf068" /> | <img width="417" height="847" alt="2" src="https://github.com/user-attachments/assets/4b2d09cb-a00c-40eb-9324-8a4c98653c6e" /> |

---
  | Details Screen | Cart Screen |
  |------------------------|------------------|
  | <img width="404" height="846" alt="3" src="https://github.com/user-attachments/assets/6740533a-876b-4231-aa7b-09385fd3474f" /> | <img width="425" height="850" alt="4" src="https://github.com/user-attachments/assets/09b03413-014f-4882-a198-5b7efcd6b0d0" /> |

---

## 🚀 How to Run the Project

1. Clone the repository:
   ```bash
   
   git clone https://github.com/ibrahimjamil301/Online-Shop.git

   ```
2. Open the project in **Android Studio**.  
3. Wait for Gradle to finish syncing and downloading all dependencies.  
4. Connect your Android device or start an emulator.  
5. Click **Run ▶️** or execute the following command in the terminal:
   
   ```bash
   
   ./gradlew installDebug
   
   ```
---

## 👤 Author

**Ibrahim Jamil**  
📍 Cairo, Egypt  
💻 Android Developer passionate about building clean, scalable, and user-friendly mobile apps.

📧 [ibrahimjamil301@gmail.com](mailto:ibrahimjamil301@gmail.com)  
🔗 [GitHub Profile](https://github.com/ibrahimjamil301)  
💼 [LinkedIn Profile](https://www.linkedin.com/in/ibrahim-jamil-15a501242/)

---

## 📝 License

This project is created for **educational purposes only** and is not licensed for commercial use.
 
