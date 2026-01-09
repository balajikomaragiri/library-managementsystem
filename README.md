                             ┌────────────────────────┐
                    │          User          │   <<Base Class>>
                    ├────────────────────────┤
                    │ - userId               │
                    │ - name                 │
                    │ - maxBorrowLimit       │
                    │ - borrowedItem         │
                    ├────────────────────────┤
                    │ + borrow(item)         │
                    │ + returnItem()         │
                    │ + showBorrowedItems()  │
                    └─────────▲──────────────┘
                              │
                  ┌───────────┴───────────┐
                  │                       │
        ┌─────────────────┐     ┌─────────────────┐
        │     Student     │     │    Professor    │
        │ <<Derived>>     │     │ <<Derived>>     │
        ├─────────────────┤     ├─────────────────┤
        │ maxLimit = 1    │     │ higher limit    │
        │ books only      │     │ books + mags    │
        └─────────────────┘     └─────────────────┘
                              │
                              │ borrows / returns
                              ▼
                    ┌─────────────────────┐
                    │    LibraryItem      │   <<Base Class>>
                    ├─────────────────────┤
                    │ - itemId            │
                    │ - title             │
                    │ - isAvailable       │
                    ├─────────────────────┤
                    │ + borrowItem()      │
                    │ + returnItem()      │
                    │ + showDetails()     │
                    └─────────▲───────────┘
                              │
                  ┌───────────┴───────────┐
                  │                       │
        ┌─────────────────┐     ┌─────────────────┐
        │      Book       │     │    Magazine     │
        │ <<Derived>>     │     │ <<Derived>>     │
        ├─────────────────┤     ├─────────────────┤
        │ - author        │     │ - issueNumber   │
        ├─────────────────┤     ├─────────────────┤
        │ + showDetails() │     │ + showDetails() │
        └─────────────────┘     └─────────────────┘
📚 Library Management System – UML Design Explanation

This project follows an object-oriented design using inheritance, polymorphism, and method overriding to model a real-world Library Management System.

🔹 User Hierarchy

User is the base class that represents a generic library user.

It contains common attributes such as userId, name, maxBorrowLimit, and borrowedItem.

It also defines common behaviors like:

borrow()

returnItem()

showBorrowedItems()

Derived Classes:

Student

Can borrow only books

Has a maximum borrowing limit of 1

Overrides the borrow() method to enforce rules

Professor

Can borrow both books and magazines

Uses the base class borrowing behavior

This hierarchy demonstrates inheritance and method overriding.

🔹 Library Item Hierarchy

LibraryItem is the base class for all items in the library.

It stores common properties such as itemId, title, and isAvailable.

It provides core functionalities:

borrowItem()

returnItem()

showDetails()

Derived Classes:

Book

Adds author information

Overrides showDetails() to display book-specific details

Magazine

Adds issueNumber

Overrides showDetails() for magazine-specific details

This hierarchy demonstrates polymorphism through method overriding.

🔹 Relationship Between Users and Library Items

A User borrows and returns a LibraryItem

This represents an association (uses-a relationship)

The system ensures:

Only available items can be borrowed

Borrowing limits are enforced

Item availability is updated correctly

User borrowing records are maintained

🔹 Object-Oriented Concepts Used

Inheritance – to share common behavior

Polymorphism – to handle books and magazines uniformly

Method Overriding – to apply different rules for different users and items

Encapsulation – to protect internal data

Real-world modeling – clear separation of users and items
