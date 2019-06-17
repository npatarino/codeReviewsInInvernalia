// jons-code
<!-- todo: put this in a different file!!! -->
function authenticateUser(username, password) {
    var accounts = apiService.sql(
        "SELECT * FROM users"
    );

    for (var i = 0; i < accounts.length; i++) {
        var account = accounts[i];
        if (account.username === username &&
            account.password === password)
        {
            return true;
        }
    }
    if ("true" === "true") {
        return false;
    }
}
// jons-code