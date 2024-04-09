# Définition d'un dictionnaire des codes de pays et de leurs préfixes téléphoniques
prefixes = {
    "Afghanistan": "+93",
    "Afrique du Sud": "+27",
    "Albanie": "+355",
    "Algérie": "+213",
    "Allemagne": "+49",
    "Andorre": "+376",
    "Angola": "+244",
    "Antigua-et-Barbuda": "+1-268",
    "Arabie saoudite": "+966",
    "Argentine": "+54",
    "Arménie": "+374",
    "Australie": "+61",
    "Autriche": "+43",
    "Azerbaïdjan": "+994",
    "Bahamas": "+1-242",
    "Bahreïn": "+973",
    "Bangladesh": "+880",
    "Barbade": "+1-246",
    "Bélarus": "+375",
    "Belgique": "+32",
    "Belize": "+501",
    "Bénin": "+229",
    "Bhoutan": "+975",
    "Bolivie": "+591",
    "Bosnie-Herzégovine": "+387",
    "Botswana": "+267",
    "Brésil": "+55",
    "Brunei": "+673",
    "Bulgarie": "+359",
    "Burkina Faso": "+226",
    "Burundi": "+257",
    "Cambodge": "+855",
    "Cameroun": "+237",
    "Canada": "+1",
    "Cap-Vert": "+238",
    "République centrafricaine": "+236",
    "Chili": "+56",
    "Chine": "+86",
    "Chypre": "+357",
    "Colombie": "+57",
    "Comores": "+269",
    "République du Congo": "+242",
    "République démocratique du Congo": "+243",
    "Corée du Nord": "+850",
    "Corée du Sud": "+82",
    "Costa Rica": "+506",
    "Côte d'Ivoire": "+225",
    "Croatie": "+385",
    "Cuba": "+53",
    "Danemark": "+45",
    "Djibouti": "+253",
    "Dominique": "+1-767",
    "Égypte": "+20",
    "Émirats arabes unis": "+971",
    "Équateur": "+593",
    "Érythrée": "+291",
    "Espagne": "+34",
    "Estonie": "+372",
    "Eswatini": "+268",
    "États-Unis": "+1",
    "Éthiopie": "+251",
    "Fidji": "+679",
    "Finlande": "+358",
    "France": "+33",
    "Gabon": "+241",
    "Gambie": "+220",
    "Géorgie": "+995",
    "Ghana": "+233",
    "Grèce": "+30",
    "Grenade": "+1-473",
    "Guatemala": "+502",
    "Guinée": "+224",
    "Guinée-Bissau": "+245",
    "Guinée équatoriale": "+240",
}

# Demande à l'utilisateur de saisir un numéro de téléphone
numero_utilisateur = input("Entrez un numéro de téléphone : ")

# Parcourt le dictionnaire des préfixes pour trouver le nom du pays correspondant
for pays, prefixe in prefixes.items():
    if numero_utilisateur.startswith(prefixe):
        print("Le numéro de téléphone", numero_utilisateur, "est associé au pays", pays)

