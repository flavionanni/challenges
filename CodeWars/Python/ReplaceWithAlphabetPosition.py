def alphabet_position(text):
    ans = ''
    inp = list('abcdefghijklmnopqrstuvwxyz')
    for i in text:
        if i.isalpha():
            ans += str(inp.index(i.lower()) + 1) + ' '
    return ans[0:len(ans)-1]

print(alphabet_position("The sunset sets at twelve o' clock."))
