
class Person {
    constructor(name, address, phoneNumber, email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    toString() {
        return `${this.constructor.name} : ${this.name}`;
    }
}

module.exports = Person;