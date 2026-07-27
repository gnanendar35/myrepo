
import numpy as np
students = ["Rahul", "Arun", "Kiran", "Ravi", "Ajay"]
subjects = ["Maths", "Science", "English"]
marks = np.array([
    [56, 78, 97],
    [34, 56, 69],
    [67, 89, 99],
    [89, 44, 78],
    [56, 78, 34]
])


print("\n========= Student Marks Dataset ======")
print(marks)



rows, columns = marks.shape

print("\nNumber of Students :", rows)
print("Number of Subjects :", columns)
print("Shape :", marks.shape)
print("Size :", marks.size)
print("Dimensions :", marks.ndim)
print("Data Type :", marks.dtype)

print("\nTotal Marks :", marks.sum())
print("Average Marks :", marks.mean())
print("Highest Mark :", marks.max())
print("Lowest Mark :", marks.min())
print("Standard Deviation :", marks.std())



print("\n========== STUDENT REPORT ==========")

for i in range(len(students)):

    print("\nStudent :", students[i])

    for j in range(len(subjects)):
        print(subjects[j], ":", marks[i][j])

    total = marks[i].sum()
    average = marks[i].mean()
    highest = marks[i].max()
    lowest = marks[i].min()

    print("Total :", total)
    print("Average :", average)
    print("Highest :", highest)
    print("Lowest :", lowest)


print("\n========== SUBJECT ANALYSIS ==========")

for i in range(len(subjects)):
    print("\nSubject :", subjects[i])
    print("Average :", marks[:, i].mean())
    print("Highest :", marks[:, i].max())
    print("Lowest :", marks[:, i].min())
print("\nMarks Greater Than 80")
print(marks[marks > 80])



print("\nMarks After Adding 5 Grace Marks")
print(marks + 5)



print("\nRavel")
print(marks.ravel())

print("\nFlatten")
print(marks.flatten())

print("\nTranspose")
print(marks.T)



average_marks = marks.mean(axis=1)

topper = np.argmax(average_marks)

print("\n========== CLASS TOPPER ==========")
print("Student :", students[topper])
print("Average :", average_marks[topper])


print("\n========== RESULT ==========")

for i in range(len(students)):

    if np.all(marks[i] >= 35):
        print(students[i], "PASS")
    else:
        print(students[i], "FAIL")