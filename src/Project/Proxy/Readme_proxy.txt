Un server precum cel al S.P.C.L.E.P. ce contine date despre persoane fizice este apleat de ori de cate ori alte sisteme (cum ar fi cel al politiei, unei judecatorii, primariei locale, etc.) vor sa aceseze acele date.
Aceste accesari sunt foarte vrecvente si prin urmare serverul este ocupat aproape constant.
Ca sa minimizeze numarul de verificari ce trebuie rulate de serverul S.P.C.L.E.P., un proxy exista pe fiecare calculator ce poate apela serverul.
Acest proxy verifica validitatea detlor introduse, apoi trimite acel request catre serverul S.P.C.L.E.P..

In exemplul acesta am luat in considerare numai numele, adresa si CNP-ul, dar o baza de date adevarata ar contine si
date despre alte documente (certificat de nastere, buletin, pasaport, permis de condus, permis de pescuit, etc), stare civila, etc.
Am implementat felul in care un astfel de Proxy ar putea verifica validitatea unui CNP introdus apoi ar apela baza de date.