# 📝 To-Do List App (Android Jetpack Compose)

![Android](https://img.shields.io/badge/Platform-Android-green.svg?style=flat&logo=android)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg?style=flat&logo=kotlin)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose%20M3-4285F4.svg?style=flat&logo=jetpackcompose)
![Min SDK](https://img.shields.io/badge/Min%20SDK-24-orange.svg)
![Target SDK](https://img.shields.io/badge/Target%20SDK-35-blue.svg)

Aplikasi manajemen tugas harian yang modern, elegan, dan intuitif yang dibangun dengan **Kotlin** dan **Jetpack Compose (Material 3)**. Aplikasi ini dirancang untuk membantu pengguna mengelola daftar kegiatan harian (seperti *Kuliah*, *Kerja*, dan *Pribadi*) agar lebih teratur, produktif, dan terpantau dengan baik.

---

## ✨ Fitur Utama

- 🚀 **Welcome / Onboarding Screen**:
  - Desain antarmuka yang bersih dan ramah pengguna.
  - Ilustrasi kustom vektor berbasis Canvas & Compose layout (Laptop, Tablet Checklist, Karakter, dan Pot Tanaman).
  - Badge identitas pengguna (`Rehan Bagas Kara`) dan indikator pagination.

- 📊 **Dashboard & Progress Tracker**:
  - **Progres Hari Ini**: Perhitungan otomatis jumlah tugas yang selesai (contoh: *"2 dari 4 tugas selesai"*).
  - **Progress Bar Teranimasi**: Mengukur persentase penyelesaian tugas secara *real-time*.
  - **Profil Avatar**: Inisial profil pengguna yang minimalis.

- 🎯 **Filter Tugas Interaktif**:
  - Chip filter dinamis (**Semua**, **Belum**, **Selesai**) untuk memisahkan tugas sesuai statusnya.

- 🏷️ **Tingkat Prioritas Tugas**:
  - **Tinggi**: Tag warna Merah (`#D9534F`)
  - **Sedang**: Tag warna Oranye (`#D9822B`)
  - **Rendah**: Tag warna Hijau (`#457B6C`)

- ⚡ **Checkbox & Status Interaktif**:
  - Menandai tugas yang selesai secara langsung dengan efek coretan (*strikethrough*) dan pembaruan statistik otomatis.

- ➕ **Tambah Tugas Baru (Modal Dialog)**:
  - Form dialog modern untuk membuat tugas baru dengan mengisikan *Nama Tugas*, *Kategori*, *Tingkat Prioritas*, dan *Tanggal*.

---

## 🛠️ Teknologi & Tools

- **Bahasa Pemrograman**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose (Material 3)](https://developer.android.com/jetpack/compose)
- **Arsitektur**: Modern Android Development (Declarative UI & State Management)
- **Desain**: Material Design 3 (Sage Green Theme)
- **Minimum SDK**: API 24 (Android 7.0 Nougat)
- **Target SDK**: API 35 (Android 15)

---

## 📁 Struktur Proyek

```text
MyApplication3/
├── app/
│   ├── src/main/java/com/example/myapplication/
│   │   ├── model/
│   │   │   └── TaskItem.kt            # Data class TaskItem, PriorityLevel, & FilterType
│   │   ├── ui/
│   │   │   ├── components/
│   │   │   │   ├── AddTaskDialog.kt   # Dialog modal tambah tugas baru
│   │   │   │   └── IllustrationGraphic.kt # Ilustrasi kustom halaman welcome
│   │   │   ├── screens/
│   │   │   │   ├── DashboardScreen.kt # Halaman utama daftar tugas & progress
│   │   │   │   └── WelcomeScreen.kt   # Halaman landing / welcome
│   │   │   └── theme/
│   │   │       ├── Color.kt           # Definisi palet warna Sage Green
│   │   │       └── Theme.kt           # Material 3 Theme setup
│   │   └── MainActivity.kt            # Entry point & Navigasi state aplikasi
│   └── src/main/res/                  # Resources (Themes, Icons, Drawables)
├── build.gradle.kts
└── README.md
```

---

## 🚀 Cara Menjalankan Proyek

1. **Prasyarat**:
   - Install **Android Studio** (Versi Ladybug / Koala / 2024.1+ direkomendasikan).
   - JDK 17 atau yang lebih baru.
   - Android SDK API level 35.

2. **Langkah-Langkah**:
   - Clone atau buka folder proyek ini di Android Studio:
     ```bash
     git clone <repository-url>
     ```
   - Lakukan **Gradle Sync** (klik ikon gajah di pojok kanan atas Android Studio).
   - Jalankan Emulator Android atau sambungkan HP fisik dengan USB Debugging aktif.
   - Klik tombol **Run (▶️)** atau tekan shortcut `Shift + F10`.

---

## 📄 Lisensi

Proyek ini dibuat untuk keperluan demonstrasi antarmuka dan manajemen tugas pada Android.
