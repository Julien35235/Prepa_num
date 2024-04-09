import GPIO as GPIO
import os

# Définir le mode GPIO
GPIO.setmode(GPIO.BCM)

# Définir le pin GPIO que vous utilisez
GPIO_PIN = 21
GPIO.setup(GPIO_PIN, GPIO.IN, pull_up_down=GPIO.PUD_UP)

# Fonction pour gérer l'événement
def Shutdown(channel):
    os.system("sudo shutdown -h now")

# Ajouter un détecteur d'événement
GPIO.add_event_detect(GPIO_PIN, GPIO.FALLING, callback=Shutdown, bouncetime=2000)

# Boucle infinie
while True:
    pass

