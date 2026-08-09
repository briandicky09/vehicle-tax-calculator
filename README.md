# Vehicle Tax Calculator

Dual-implementation vehicle tax (PKB & SWDKLLJ) calculation system, built twice as an OOP coursework project: once in **Java (NetBeans, Swing)** and once in **C++ (Qt Creator, Qt Widgets)**. Both versions take vehicle owner and vehicle data, calculate the applicable tax, and keep a transaction history — with the Qt version additionally adding file-based persistence, search, edit, and delete.

## Tax Calculation Logic

- **PKB (Pajak Kendaraan Bermotor)**: 1.5% of NJKB (Nilai Jual Kendaraan Bermotor / vehicle sale value).
- **SWDKLLJ (Sumbangan Wajib Dana Kecelakaan Lalu Lintas Jalan)**: flat rate based on vehicle type:
  - Motor (motorcycle): Rp 35.000
  - Mobil Penumpang (passenger car): Rp 143.000
  - Truk (truck): Rp 163.000
- **Total Tax** = PKB + SWDKLLJ

## Project Structure

```
├── netbeans/                     # Java Swing implementation
│   ├── src/
│   │   ├── pajakkendaraan/
│   │   │   ├── PajakKendaraan.java   # Entry point (main)
│   │   │   ├── FormUtama.java/.form  # Main input form
│   │   │   ├── Kendaraan.java        # Vehicle model
│   │   │   ├── Pemilik.java          # Owner model
│   │   │   ├── Pajak.java            # Tax calculation model
│   │   │   └── TransaksiPajak.java   # Transaction record model
│   │   └── Form/
│   │       ├── DashboardForm.java/.form
│   │       ├── HasilForm.java/.form  # Calculation result form
│   │       └── RiwayatForm.java/.form # Transaction history form
│   ├── build.xml
│   ├── manifest.mf
│   └── nbproject/
│
└── qt/                            # C++ Qt Widgets implementation
    ├── main.cpp                   # Entry point
    ├── mainwindow.h / .cpp        # Main window
    ├── Datakendaraan.h            # Vehicle data struct
    ├── Hitungpajak.h / .cpp       # Tax calculation logic
    ├── hasil.h / .cpp             # Result display widget
    ├── Riwayat.h / .cpp           # History widget (with search)
    ├── Detail.h / .cpp            # Detail/edit view
    └── Save.h / .cpp              # File persistence (riwayat.txt) & Rupiah formatting
```

> Note: files under `qt/` are stored with a `.txt` extension in this repo; rename them back to their proper `.h`/`.cpp` extensions before opening the project in Qt Creator.

## Features

| Feature | Java (NetBeans) | C++ (Qt) |
|---|---|---|
| Input vehicle & owner data | ✅ | ✅ |
| Automatic PKB & SWDKLLJ calculation | ✅ | ✅ |
| Transaction history (in-session) | ✅ | ✅ |
| Persist history to file | ❌ | ✅ (`riwayat.txt`) |
| Search history | ❌ | ✅ |
| Edit / delete history entry | ❌ | ✅ |
| Rupiah currency formatting | ❌ | ✅ |

## Getting Started

### Java (NetBeans) version

1. Open Apache NetBeans.
2. Open the `netbeans/` folder as an existing project (it includes `build.xml` and `nbproject/`).
3. Run the project — it starts from `pajakkendaraan.PajakKendaraan` (`main` method), which opens `FormUtama`.

Alternatively, build from the command line with Ant:

```bash
cd netbeans
ant run
```

### C++ (Qt) version

1. Rename each file in `qt/` by stripping the trailing `.txt` (e.g. `mainwindow.cpp.txt` → `mainwindow.cpp`).
2. Open the folder in Qt Creator as a new project, or create a `.pro` file including all the source/header files.
3. Build and run with Qt Creator (Qt Widgets module required).
4. Transaction history is saved to `riwayat.txt` in the working directory.

## Tech Stack

- **Java**, Swing, NetBeans GUI Builder, Apache Ant
- **C++**, Qt Widgets (Qt Creator)

## Author's Note

Built as a coursework project for Object-Oriented Programming, demonstrating the same domain model and business logic implemented across two different languages/frameworks.
