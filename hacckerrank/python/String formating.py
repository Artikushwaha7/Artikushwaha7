nbin = format(number,'b')
    size = len(nbin)
    for i in range(1,n+1):
        octa = format(i,'o')
        hexa = format(i,'X')
        bina = format(i,'b')
        
        print(str(i).rjust(size),str(octa).rjust(size),str(hexa).rjust(size),str(bina).rjust(size))
