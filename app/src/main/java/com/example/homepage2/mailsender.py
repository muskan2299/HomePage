import smtplib

s = smtplib.SMTP('smtp.gmail.com', 587) 
# start TLS for security 
s.starttls() 
# Authentication 
s.login("ishitasaxena1209@gmail", "ihateyou>3000") 
# message to be sent 
message = "Message_you_need_to_send" 
# sending the mail 
s.sendmail("ishitasaxena1209@gmail", "agarwal.muskan22@gmail", message) 
# terminating the session 
s.quit()