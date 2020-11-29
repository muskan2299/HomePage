import smtplib

s = smtplib.SMTP('smtp.gmail.com', 587)

s.starttls()

s.login("ishitasaxena1209@gmail", "psswrd")

message = "Message_you_need_to_send"

s.sendmail("ishitasaxena1209@gmail", "agarwal.muskan22@gmail", message)

s.quit()