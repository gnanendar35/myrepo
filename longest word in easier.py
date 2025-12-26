def separate(word):
    if len(word)>10:
        firstword=word[0]
        middleword=(len(word)-2)
        lastword=word[-1]
        return  f"({firstword}{middleword}{lastword})"
    else:
        return "shortword"
word=input()
print(separate(word))
