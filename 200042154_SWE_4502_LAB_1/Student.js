const Person = require('./Person');

class Student extends Person {
    constructor(name, address, phoneNumber, email, status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
}

module.exports = Student;