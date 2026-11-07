1) nextId needs to be static because it's something that is supposed to be counted by all of the accounts together and not be individually different.
2) Every single one of the accounts would of had a different nextId and not the same one and every account would of had the same starting ID.
3) Because if it were to be a static function it would look like this BankAccount.deposit(200) and from this we can see that its trying to add money but not straight into an existing account so because of that it wouldnt know whos balance to change.
4) No, because without a object it wouldnt have a specific accounts balance to access and do the functions on.
5) yes, because a static variable is something that every object can use and will have the same result with.
6) Because then every person could tamper with everyones balance for the better or the worse.
7) same reason as question 6. 
8) Yes, because even though they have the same nextId it doesnt really matter because they have their individual ID to differentiate themselves from other account which is what actually help the balances not get mixed up and the nextId is just a static variable that every object will have the same of.
9) because a string doesnt help you with changing the actual info that the account has compared to a object.