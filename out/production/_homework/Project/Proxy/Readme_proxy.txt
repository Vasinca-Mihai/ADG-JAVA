Presupunem exisenta unei baze de date precum ce a S.P.C.L.E.P. ce contine date despre persoanele inregistrate in el.

In exemplul acesta am luat in considerare numai numele, adresa si CNP-ul, dar o baza de date adevarata ar contine si
date despre alte documente (certificat de nastere, buletin, pasaport, permis de condus, permis de pescuit, etc)
Acest server este apleat de ori de cate ori alte sisteme (cum ar fi cel al politiei, unei judecatorii, primariei locale, etc.) vor sa aceseze acele date.

Aceste accesari sunt foarte vrecvente si prin urmare calculatorul care se ocupa de acesta baza de date este foarte ocupat.

Ca sa minimizeze numarul de verificari ce trebuie rulate de serverul S.P.C.L.E.P., un proxy exista pe fiecare calculator ce poate apela serverul.

Acest proxy verifica validitatea datelor introduse si trimite acel request catre serverul S.P.C.L.E.P..

In acest exemplu am implementat felul in care un astfel de Proxy ar verifica validitatea unui CNP introdus.