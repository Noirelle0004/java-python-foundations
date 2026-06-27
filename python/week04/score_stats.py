def find_total(scores):
    total = 0

    for score in scores:
        total = total + score

    return total


def find_average(scores):
    total = find_total(scores)
    average = total / len(scores)

    return average


def find_max(scores):
    max_score = scores[0]

    for score in scores:
        if score > max_score:
            max_score = score

    return max_score


def find_min(scores):
    min_score = scores[0]

    for score in scores:
        if score < min_score:
            min_score = score

    return min_score


def count_pass(scores):
    pass_count = 0

    for score in scores:
        if score >= 60:
            pass_count = pass_count + 1

    return pass_count


def count_fail(scores):
    fail_count = 0

    for score in scores:
        if score < 60:
            fail_count = fail_count + 1

    return fail_count


scores = [88, 59, 76, 92, 45, 100, 67]

total = find_total(scores)
average = find_average(scores)
max_score = find_max(scores)
min_score = find_min(scores)
pass_count = count_pass(scores)
fail_count = count_fail(scores)

print("total =", total)
print("average =", average)
print("max =", max_score)
print("min =", min_score)
print("pass count =", pass_count)
print("fail count =", fail_count)