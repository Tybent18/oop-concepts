#include <iostream>
#include <string>
using namespace std;

class Animal {
public:
    int legs;
    int age;
    string name;

    virtual void speak() = 0; // pure virtual function for polymorphism
};

class Dog : public Animal {
public:
    void speak() override {
        cout << "Woof" << endl;
    }
};

class Cat : public Animal {
public:
    void speak() override {
        cout << "Meow" << endl;
    }
};

int main() {
    Dog d;
    Cat c;

    cout << "Enter dog's name: ";
    getline(cin, d.name);
    cout << "This dog is named " << d.name << endl;

    d.speak();

    cout << "Enter dog's number of legs: ";
    cin >> d.legs;
    cout << "It has " << d.legs << " legs" << endl;

    cout << "Enter dog's age: ";
    cin >> d.age;
    cout << "It is " << d.age << " years old" << endl;

    cin.ignore(); // clear newline for next getline
    cout << "\nEnter cat's name: ";
    getline(cin, c.name);
    cout << "This cat is named " << c.name << endl;

    c.speak();

    cout << "Enter cat's number of legs: ";
    cin >> c.legs;
    cout << "It has " << c.legs << " legs" << endl;

    cout << "Enter cat's age: ";
    cin >> c.age;
    cout << "It is " << c.age << " years old" << endl;

    return 0;
}