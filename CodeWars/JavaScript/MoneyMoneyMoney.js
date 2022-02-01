function calculateYears(principal, interest, tax, desired) {
   let interestValue = 0;
   let contYears = 0;
    while(principal < desired){

        interestValue = principal * interest;

        principal += (interestValue.toFixed(2) - (interestValue.toFixed(2) * tax))

        contYears++;
    }

    return contYears;

}
