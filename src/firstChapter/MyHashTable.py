
linkedHash = []
arrayLength = 5

def stringHashFunctionSDBM(word):
    hashAddress = 0

    for ch in word:
        hashAddress = ord(ch) + (hashAddress << 6) + (hashAddress << 16) - hashAddress

    return hashAddress

def initLinkedHash(length, linked):
    for _ in range(length):
        linked.append([])

def mapHashCodeToLinkedHash(linked, length, word):

    hashCode = stringHashFunctionSDBM(word)
    arrayPosition = hashCode % length

    linked[arrayPosition].append(word)

def printHash(linked):
    for i in range(len(linked)):
        print("Position {}: ".format(i), end="")

        k=0

        for elem in linked[i]:
            if(k > 0):
                print(", ", end="")

            print ("{}".format(elem), end="")

            k += 1

        print()

initLinkedHash(arrayLength, linkedHash)
mapHashCodeToLinkedHash(linkedHash, arrayLength, "codility")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "anvar")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "legolas")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "smaug")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "alem-mar")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "Aslam")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "juba")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "thorin")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "cair paravel")
mapHashCodeToLinkedHash(linkedHash, arrayLength, "fantasia")

printHash(linkedHash)
