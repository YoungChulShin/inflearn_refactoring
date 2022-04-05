class Book {
    
    // before
    // addReservation(customer) {
    //     this._reservations.push(customer);
    // }

    // after
    addReservation(customer) {
        zz_addReservation(customer, false);
    }

    // 1. 임시 함수로 분리하고
    zz_addReservation(customer, isPriority) {
        assert(isPriority === true || isPriority === false);
        this._reservations.push(customer);
    }
}