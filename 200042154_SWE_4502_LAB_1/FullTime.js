const Staff = require('./Staff');

class FullTime extends Staff {
    constructor(name, address, phoneNumber, email, office, salary, hireDate, title) {
        super(name, address, phoneNumber, email, office, salary, hireDate, title);
    }
}

module.exports = FullTime;