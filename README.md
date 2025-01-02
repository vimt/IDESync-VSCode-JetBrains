# IDE Sync - VSCode-JetBrains IDE Sync

>**Note:** This synchronization system is suitable for VSCode, VSCode forks like Cursor or Windsurf as well as JetBrains IntelliJ-based IDEs like Rider, IntelliJ IDEA, and WebStorm.

A synchronization system that allows seamless switching between VSCode and JetBrains IntelliJ-based IDEs while maintaining the current file and cursor position.

## Installation via Marketplace

### VSCode Extension
Install directly from the [Visual Studio Code Marketplace]([https://marketplace.visualstudio.com/items?itemName=DenisBalber.vscode-jetbrains-sync](https://marketplace.visualstudio.com/items?itemName=denisbalber.vscode-jetbrains-sync))
- Open VSCode
- Go to Extensions (Ctrl+Shift+X)
- Search for "IDE Sync - Connect to JetBrains IDE"
- Click Install

### JetBrains IDE Plugin
Install directly from the [JetBrains Marketplace]([https://plugins.jetbrains.com/plugin/23822-vscode-jetbrains-sync](https://plugins.jetbrains.com/plugin/26201-ide-sync--connect-to-vscode))
- Open JetBrains IDE
- Go to Settings > Plugins
- Search for "IDE Sync - Connec to VSCode"
- Click Install

## Version Compatibility

### VSCode
- Supported versions: VSCode 1.84.0 and newer

### JetBrains IDE
- Supported versions: 2023.3 and newer

## Configuration

The default port is 3000, this can be changed in the respective settings and must be the same:
- In VSCode: Settings > Extensions > IDE Sync - Connect to JetBrains IDE > Port
- In JetBrains IDE: Settings > Tools > IDE Sync - Connect to VSCode > WebSocket Port

## Usage

1. Start both IDEs
2. Make sure that the sync is activated in the status bar of both IDEs
3. When you switch between IDEs, the current file and cursor position will be synchronized automatically

## Features

- Real-time synchronization of file opening and cursor position
- Automatic reconnection on port changes
- Status bar indicator showing connection status

## Components

### VSCode Extension
- Monitors current file and cursor position in VSCode
- Communicates with JetBrains plugin via WebSocket

### JetBrains IDE Plugin
- Monitors current file and cursor position in JetBrains IDE
- Communicates with VSCode extension via WebSocket
