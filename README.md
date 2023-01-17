# OpenFool

OpenFool - free and open source (GPL v3) Fool (Durak) card game implementation.

## Features
### Implemented
- 4-players partnership game
- 52-card decks: Standard Russian (designed by A. Charlemagne in 19th century, public domain - from Wikimedia),
    international (by Chris Aguilar - LGPL v3)
- Customisable player names (both AI and human)
- Standard rules for throwing in

### Planned
- Individual game, arbitrary number of players (2-6)
- French deck (by David Bellot)
- Statistics
- Ability to change conventions

## How to build from sources
### Prerequisites
- Qt 5.5 or later (tested with 5.5, 5.6, 5.7, 5.8). You need the following modules
    - Qt Core
    - Qt GUI
    - Qt Widgets
    - Qt SVG
- Qt Creator (optional)
- C++ compiler (GCC/Clang/Visual C++ etc.)

*Note: the easiest way on Windows is to download the Qt Creator bundle.*

### Build process
1. Clone the repository

```bash
git clone https://github.com/artenax/OpenFool.git
```

2. Either open the project in Qt Creator, or build via the command line:

```bash
mkdir build # Alongside with source dir, not inside it
cd build
qmake ../OpenFool
# On Windows, you will probably use `mingw32-make` instead of `make`
make release # or `make debug`, or simply `make`
```

## Troubleshooting
If you're experiencing problems with rendering, especially on Windows
(i. e. wrong overlapping, Z-fighting etc.), tick
**Use OpenGL for rendering** on *Settings* page.

If you've noticed a bug, please create an issue.

## Contributing
You're welcome to contribute to the project. It's done via the standard
GitHub mechanism:
1. Fork the repository
2. Make your changes
3. Create a pull request
