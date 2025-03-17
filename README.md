# PulseCell: Indonesian Mobile Credit Management System

PulseCell is a comprehensive mobile credit management system designed to streamline pulsa transactions for Indonesian users. This academic project demonstrates core programming concepts while solving real-world problems related to mobile credit purchases.

## Features

- 📱 **Operator Identification**: Automatic detection of Indonesian mobile operators based on number prefixes
- 💸 **Transaction Processing**: Complete pulsa purchase workflow with tax calculations
- 🎁 **Promotional System**: Implementation of bonus structures for larger transactions
- 💰 **Payment Validation**: Real-time balance checking and transaction confirmation
- 📊 **Transaction History**: Logging and reporting of all transactions
- 💾 **Database Integration**: Persistent storage of transaction records
- 📝 **Data Management**: Add, edit, delete, and view transaction records

## Technology Stack

- Java SE
- Java Swing for GUI
- MySQL for database
- NetBeans IDE
- JDBC for database connectivity

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended) or any Java IDE
- MySQL Database Server

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/pulsecell.git
   ```

2. Set up the database:
   - Create a database named "latihan1"
   - Create a table named "jualpulsa" with appropriate columns

3. Open in NetBeans:
   - File > Open Project
   - Select the cloned repository folder

4. Build and run:
   - Right-click project > Run

## Project Structure

```
PulseCell/
├── src/
│   └── ProjectPulseCell/
│       ├── ProjectPulseCell.java
│       └── Konfig.java
├── build/
├── lib/
├── nbproject/
└── test/
```

## Usage

1. Select the phone number prefix to detect the operator
2. Choose the pulsa amount to calculate the payment details
3. Process the payment and view the change
4. Save the transaction to the database
5. View, edit, or delete previous transactions from the table

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/new-operator-support`)
3. Commit your changes (`git commit -m 'Add new operator detection'`)
4. Push to the branch (`git push origin feature/new-operator-support`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
