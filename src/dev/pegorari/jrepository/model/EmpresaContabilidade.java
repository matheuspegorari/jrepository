package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaContabilidade extends AbstractSankhyaEntity<EmpresaContabilidade> {
   private String aceitarHistZero;
   private String aceitarVlrLanc;
   private BigDecimal codEmp;
   private BigDecimal codEmpPlacta;
   private String contador;
   private String crc;
   private String ctarEdaut;
   private String digCta;
   private Timestamp dtAbertura;
   private Timestamp dtFimPerCtb;
   private Timestamp dtInicPerCtb;
   private String empConsolida;
   private String mascCta;
   private BigDecimal nroLoteMnualFim;
   private BigDecimal nroLoteMnualIni;
   private BigDecimal numDiario;
   private String numLotesAut;
   private Timestamp referencia;
   private String simbVlrNeg;
   private String tipAtualSaldos;
   private BigDecimal ultPagDiario;
   private String utilCencus;
   private String utilProj;
   private String perAltQdCom;
   private BigDecimal codCtaCtbEncRes;
   private String ufCrcContador;
   private String codInstResp;
   private BigDecimal ultimoNumeroUsado;
   private BigDecimal nroOrdem;
   private BigDecimal nroOrdemR;
   private BigDecimal codEmpOrig;
   private BigDecimal percRateio;
   private BigDecimal empCopPla;
   private String tipPeriodo;
   private String cabDem;
   private String arqLogoMarca;
   private String usaEmpAuxCtbz;
   private String derEx;
   private BigDecimal indRecReceita;
   private String indPaisaPais;
   private String indRetid;
   private String indResiduosSolid;
   private String indRecOpa;
   private String indCopadomundo;
   private String indOlimpiadas;
   private String indRepNblRedes;
   private String indReif;
   private String indRetAero;
   private String indRecine;
   private String indRepEnec;
   private String indReicomP;
   private String indPadis;
   private String indRecap;
   private String indPatvd;
   private String indRepes;
   private String indReidi;
   private BigDecimal indMudancPc;
   private String pjSujeitaCsll;
   private String diffCont;
   private BigDecimal formatRib;
   private String optExtRtt;
   private String optPaes;
   private String indAreaCom;
   private String indOpExt;
   private String indVendExp;
   private String indPjEnquad;
   private BigDecimal tpoEmpresa;
   private String indAdmFuncLu;
   private String indCapInf;
   private String indPoloAm;
   private String indPartExt;
   private String indRoyRec;
   private String indLucExp;
   private String indAtivExt;
   private String indPartColig;
   private String indPgtoExt;
   private String indFin;
   private String indRendServ;
   private String indZonExp;
   private String indPartCons;
   private String indOpVinc;
   private String indRecExt;
   private String indAliqCsll;
   private String indPjHab;
   private String indInovTec;
   private String indAtivRural;
   private String indRedisen;
   private String indRoyPag;
   private String indEcomTi;
   private String indComExp;
   private String indDoaEleit;
   private String indPgtoRem;
   private String tipEscPre;
   private String apurCsll;
   private String formaApuri;
   private String tipEnt;
   private String optRefis;
   private String formaApur;
   private String gerRegJperAnual;
   private String indEbas;
   private String indOleoBunker;
   private String indRepEper;
   private String indRepEpetroInd;
   private String indRepEpetroNac;
   private String indRepEpetroTemp;
   private String indRepOrto;
   private String indRetEei;
   private String indRetIi;
   private String indRetPmcmv;
   private String opcPtrf2023;

   public String getAceitarHistZero() {
        return aceitarHistZero;
   }

   public void setAceitarHistZero(String aceitarHistZero) {
        markAsChanged("ACEITARHISTZERO", aceitarHistZero);
        this.aceitarHistZero = aceitarHistZero;
   }

   public String getAceitarVlrLanc() {
        return aceitarVlrLanc;
   }

   public void setAceitarVlrLanc(String aceitarVlrLanc) {
        markAsChanged("ACEITARVLRLANC", aceitarVlrLanc);
        this.aceitarVlrLanc = aceitarVlrLanc;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpPlacta() {
        return codEmpPlacta;
   }

   public void setCodEmpPlacta(BigDecimal codEmpPlacta) {
        markAsChanged("CODEMPPLACTA", codEmpPlacta);
        this.codEmpPlacta = codEmpPlacta;
   }

   public String getContador() {
        return contador;
   }

   public void setContador(String contador) {
        markAsChanged("CONTADOR", contador);
        this.contador = contador;
   }

   public String getCrc() {
        return crc;
   }

   public void setCrc(String crc) {
        markAsChanged("CRC", crc);
        this.crc = crc;
   }

   public String getCtarEdaut() {
        return ctarEdaut;
   }

   public void setCtarEdaut(String ctarEdaut) {
        markAsChanged("CTAREDAUT", ctarEdaut);
        this.ctarEdaut = ctarEdaut;
   }

   public String getDigCta() {
        return digCta;
   }

   public void setDigCta(String digCta) {
        markAsChanged("DIGCTA", digCta);
        this.digCta = digCta;
   }

   public Timestamp getDtAbertura() {
        return dtAbertura;
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        markAsChanged("DTABERTURA", dtAbertura);
        this.dtAbertura = dtAbertura;
   }

   public Timestamp getDtFimPerCtb() {
        return dtFimPerCtb;
   }

   public void setDtFimPerCtb(Timestamp dtFimPerCtb) {
        markAsChanged("DTFIMPERCTB", dtFimPerCtb);
        this.dtFimPerCtb = dtFimPerCtb;
   }

   public Timestamp getDtInicPerCtb() {
        return dtInicPerCtb;
   }

   public void setDtInicPerCtb(Timestamp dtInicPerCtb) {
        markAsChanged("DTINICPERCTB", dtInicPerCtb);
        this.dtInicPerCtb = dtInicPerCtb;
   }

   public String getEmpConsolida() {
        return empConsolida;
   }

   public void setEmpConsolida(String empConsolida) {
        markAsChanged("EMPCONSOLIDA", empConsolida);
        this.empConsolida = empConsolida;
   }

   public String getMascCta() {
        return mascCta;
   }

   public void setMascCta(String mascCta) {
        markAsChanged("MASCCTA", mascCta);
        this.mascCta = mascCta;
   }

   public BigDecimal getNroLoteMnualFim() {
        return nroLoteMnualFim;
   }

   public void setNroLoteMnualFim(BigDecimal nroLoteMnualFim) {
        markAsChanged("NROLOTEMNUALFIM", nroLoteMnualFim);
        this.nroLoteMnualFim = nroLoteMnualFim;
   }

   public BigDecimal getNroLoteMnualIni() {
        return nroLoteMnualIni;
   }

   public void setNroLoteMnualIni(BigDecimal nroLoteMnualIni) {
        markAsChanged("NROLOTEMNUALINI", nroLoteMnualIni);
        this.nroLoteMnualIni = nroLoteMnualIni;
   }

   public BigDecimal getNumDiario() {
        return numDiario;
   }

   public void setNumDiario(BigDecimal numDiario) {
        markAsChanged("NUMDIARIO", numDiario);
        this.numDiario = numDiario;
   }

   public String getNumLotesAut() {
        return numLotesAut;
   }

   public void setNumLotesAut(String numLotesAut) {
        markAsChanged("NUMLOTESAUT", numLotesAut);
        this.numLotesAut = numLotesAut;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getSimbVlrNeg() {
        return simbVlrNeg;
   }

   public void setSimbVlrNeg(String simbVlrNeg) {
        markAsChanged("SIMBVLRNEG", simbVlrNeg);
        this.simbVlrNeg = simbVlrNeg;
   }

   public String getTipAtualSaldos() {
        return tipAtualSaldos;
   }

   public void setTipAtualSaldos(String tipAtualSaldos) {
        markAsChanged("TIPATUALSALDOS", tipAtualSaldos);
        this.tipAtualSaldos = tipAtualSaldos;
   }

   public BigDecimal getUltPagDiario() {
        return ultPagDiario;
   }

   public void setUltPagDiario(BigDecimal ultPagDiario) {
        markAsChanged("ULTPAGDIARIO", ultPagDiario);
        this.ultPagDiario = ultPagDiario;
   }

   public String getUtilCencus() {
        return utilCencus;
   }

   public void setUtilCencus(String utilCencus) {
        markAsChanged("UTILCENCUS", utilCencus);
        this.utilCencus = utilCencus;
   }

   public String getUtilProj() {
        return utilProj;
   }

   public void setUtilProj(String utilProj) {
        markAsChanged("UTILPROJ", utilProj);
        this.utilProj = utilProj;
   }

   public String getPerAltQdCom() {
        return perAltQdCom;
   }

   public void setPerAltQdCom(String perAltQdCom) {
        markAsChanged("PERALTQDCOM", perAltQdCom);
        this.perAltQdCom = perAltQdCom;
   }

   public BigDecimal getCodCtaCtbEncRes() {
        return codCtaCtbEncRes;
   }

   public void setCodCtaCtbEncRes(BigDecimal codCtaCtbEncRes) {
        markAsChanged("CODCTACTBENCRES", codCtaCtbEncRes);
        this.codCtaCtbEncRes = codCtaCtbEncRes;
   }

   public String getUfCrcContador() {
        return ufCrcContador;
   }

   public void setUfCrcContador(String ufCrcContador) {
        markAsChanged("UFCRCCONTADOR", ufCrcContador);
        this.ufCrcContador = ufCrcContador;
   }

   public String getCodInstResp() {
        return codInstResp;
   }

   public void setCodInstResp(String codInstResp) {
        markAsChanged("CODINSTRESP", codInstResp);
        this.codInstResp = codInstResp;
   }

   public BigDecimal getUltimoNumeroUsado() {
        return ultimoNumeroUsado;
   }

   public void setUltimoNumeroUsado(BigDecimal ultimoNumeroUsado) {
        markAsChanged("ULTIMONUMEROUSADO", ultimoNumeroUsado);
        this.ultimoNumeroUsado = ultimoNumeroUsado;
   }

   public BigDecimal getNroOrdem() {
        return nroOrdem;
   }

   public void setNroOrdem(BigDecimal nroOrdem) {
        markAsChanged("NROORDEM", nroOrdem);
        this.nroOrdem = nroOrdem;
   }

   public BigDecimal getNroOrdemR() {
        return nroOrdemR;
   }

   public void setNroOrdemR(BigDecimal nroOrdemR) {
        markAsChanged("NROORDEM_R", nroOrdemR);
        this.nroOrdemR = nroOrdemR;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
        this.codEmpOrig = codEmpOrig;
   }

   public BigDecimal getPercRateio() {
        return percRateio;
   }

   public void setPercRateio(BigDecimal percRateio) {
        markAsChanged("PERCRATEIO", percRateio);
        this.percRateio = percRateio;
   }

   public BigDecimal getEmpCopPla() {
        return empCopPla;
   }

   public void setEmpCopPla(BigDecimal empCopPla) {
        markAsChanged("EMPCOPPLA", empCopPla);
        this.empCopPla = empCopPla;
   }

   public String getTipPeriodo() {
        return tipPeriodo;
   }

   public void setTipPeriodo(String tipPeriodo) {
        markAsChanged("TIPPERIODO", tipPeriodo);
        this.tipPeriodo = tipPeriodo;
   }

   public String getCabDem() {
        return cabDem;
   }

   public void setCabDem(String cabDem) {
        markAsChanged("CABDEM", cabDem);
        this.cabDem = cabDem;
   }

   public String getArqLogoMarca() {
        return arqLogoMarca;
   }

   public void setArqLogoMarca(String arqLogoMarca) {
        markAsChanged("ARQLOGOMARCA", arqLogoMarca);
        this.arqLogoMarca = arqLogoMarca;
   }

   public String getUsaEmpAuxCtbz() {
        return usaEmpAuxCtbz;
   }

   public void setUsaEmpAuxCtbz(String usaEmpAuxCtbz) {
        markAsChanged("USAEMPAUXCTBZ", usaEmpAuxCtbz);
        this.usaEmpAuxCtbz = usaEmpAuxCtbz;
   }

   public String getDerEx() {
        return derEx;
   }

   public void setDerEx(String derEx) {
        markAsChanged("DEREX", derEx);
        this.derEx = derEx;
   }

   public BigDecimal getIndRecReceita() {
        return indRecReceita;
   }

   public void setIndRecReceita(BigDecimal indRecReceita) {
        markAsChanged("INDRECRECEITA", indRecReceita);
        this.indRecReceita = indRecReceita;
   }

   public String getIndPaisaPais() {
        return indPaisaPais;
   }

   public void setIndPaisaPais(String indPaisaPais) {
        markAsChanged("INDPAISAPAIS", indPaisaPais);
        this.indPaisaPais = indPaisaPais;
   }

   public String getIndRetid() {
        return indRetid;
   }

   public void setIndRetid(String indRetid) {
        markAsChanged("INDRETID", indRetid);
        this.indRetid = indRetid;
   }

   public String getIndResiduosSolid() {
        return indResiduosSolid;
   }

   public void setIndResiduosSolid(String indResiduosSolid) {
        markAsChanged("INDRESIDUOSSOLID", indResiduosSolid);
        this.indResiduosSolid = indResiduosSolid;
   }

   public String getIndRecOpa() {
        return indRecOpa;
   }

   public void setIndRecOpa(String indRecOpa) {
        markAsChanged("INDRECOPA", indRecOpa);
        this.indRecOpa = indRecOpa;
   }

   public String getIndCopadomundo() {
        return indCopadomundo;
   }

   public void setIndCopadomundo(String indCopadomundo) {
        markAsChanged("INDCOPADOMUNDO", indCopadomundo);
        this.indCopadomundo = indCopadomundo;
   }

   public String getIndOlimpiadas() {
        return indOlimpiadas;
   }

   public void setIndOlimpiadas(String indOlimpiadas) {
        markAsChanged("INDOLIMPIADAS", indOlimpiadas);
        this.indOlimpiadas = indOlimpiadas;
   }

   public String getIndRepNblRedes() {
        return indRepNblRedes;
   }

   public void setIndRepNblRedes(String indRepNblRedes) {
        markAsChanged("INDREPNBLREDES", indRepNblRedes);
        this.indRepNblRedes = indRepNblRedes;
   }

   public String getIndReif() {
        return indReif;
   }

   public void setIndReif(String indReif) {
        markAsChanged("INDREIF", indReif);
        this.indReif = indReif;
   }

   public String getIndRetAero() {
        return indRetAero;
   }

   public void setIndRetAero(String indRetAero) {
        markAsChanged("INDRETAERO", indRetAero);
        this.indRetAero = indRetAero;
   }

   public String getIndRecine() {
        return indRecine;
   }

   public void setIndRecine(String indRecine) {
        markAsChanged("INDRECINE", indRecine);
        this.indRecine = indRecine;
   }

   public String getIndRepEnec() {
        return indRepEnec;
   }

   public void setIndRepEnec(String indRepEnec) {
        markAsChanged("INDREPENEC", indRepEnec);
        this.indRepEnec = indRepEnec;
   }

   public String getIndReicomP() {
        return indReicomP;
   }

   public void setIndReicomP(String indReicomP) {
        markAsChanged("INDREICOMP", indReicomP);
        this.indReicomP = indReicomP;
   }

   public String getIndPadis() {
        return indPadis;
   }

   public void setIndPadis(String indPadis) {
        markAsChanged("INDPADIS", indPadis);
        this.indPadis = indPadis;
   }

   public String getIndRecap() {
        return indRecap;
   }

   public void setIndRecap(String indRecap) {
        markAsChanged("INDRECAP", indRecap);
        this.indRecap = indRecap;
   }

   public String getIndPatvd() {
        return indPatvd;
   }

   public void setIndPatvd(String indPatvd) {
        markAsChanged("INDPATVD", indPatvd);
        this.indPatvd = indPatvd;
   }

   public String getIndRepes() {
        return indRepes;
   }

   public void setIndRepes(String indRepes) {
        markAsChanged("INDREPES", indRepes);
        this.indRepes = indRepes;
   }

   public String getIndReidi() {
        return indReidi;
   }

   public void setIndReidi(String indReidi) {
        markAsChanged("INDREIDI", indReidi);
        this.indReidi = indReidi;
   }

   public BigDecimal getIndMudancPc() {
        return indMudancPc;
   }

   public void setIndMudancPc(BigDecimal indMudancPc) {
        markAsChanged("INDMUDANCPC", indMudancPc);
        this.indMudancPc = indMudancPc;
   }

   public String getPjSujeitaCsll() {
        return pjSujeitaCsll;
   }

   public void setPjSujeitaCsll(String pjSujeitaCsll) {
        markAsChanged("PJSUJEITACSLL", pjSujeitaCsll);
        this.pjSujeitaCsll = pjSujeitaCsll;
   }

   public String getDiffCont() {
        return diffCont;
   }

   public void setDiffCont(String diffCont) {
        markAsChanged("DIFFCONT", diffCont);
        this.diffCont = diffCont;
   }

   public BigDecimal getFormatRib() {
        return formatRib;
   }

   public void setFormatRib(BigDecimal formatRib) {
        markAsChanged("FORMATRIB", formatRib);
        this.formatRib = formatRib;
   }

   public String getOptExtRtt() {
        return optExtRtt;
   }

   public void setOptExtRtt(String optExtRtt) {
        markAsChanged("OPTEXTRTT", optExtRtt);
        this.optExtRtt = optExtRtt;
   }

   public String getOptPaes() {
        return optPaes;
   }

   public void setOptPaes(String optPaes) {
        markAsChanged("OPTPAES", optPaes);
        this.optPaes = optPaes;
   }

   public String getIndAreaCom() {
        return indAreaCom;
   }

   public void setIndAreaCom(String indAreaCom) {
        markAsChanged("INDAREACOM", indAreaCom);
        this.indAreaCom = indAreaCom;
   }

   public String getIndOpExt() {
        return indOpExt;
   }

   public void setIndOpExt(String indOpExt) {
        markAsChanged("INDOPEXT", indOpExt);
        this.indOpExt = indOpExt;
   }

   public String getIndVendExp() {
        return indVendExp;
   }

   public void setIndVendExp(String indVendExp) {
        markAsChanged("INDVENDEXP", indVendExp);
        this.indVendExp = indVendExp;
   }

   public String getIndPjEnquad() {
        return indPjEnquad;
   }

   public void setIndPjEnquad(String indPjEnquad) {
        markAsChanged("INDPJENQUAD", indPjEnquad);
        this.indPjEnquad = indPjEnquad;
   }

   public BigDecimal getTpoEmpresa() {
        return tpoEmpresa;
   }

   public void setTpoEmpresa(BigDecimal tpoEmpresa) {
        markAsChanged("TPOEMPRESA", tpoEmpresa);
        this.tpoEmpresa = tpoEmpresa;
   }

   public String getIndAdmFuncLu() {
        return indAdmFuncLu;
   }

   public void setIndAdmFuncLu(String indAdmFuncLu) {
        markAsChanged("INDADMFUNCLU", indAdmFuncLu);
        this.indAdmFuncLu = indAdmFuncLu;
   }

   public String getIndCapInf() {
        return indCapInf;
   }

   public void setIndCapInf(String indCapInf) {
        markAsChanged("INDCAPINF", indCapInf);
        this.indCapInf = indCapInf;
   }

   public String getIndPoloAm() {
        return indPoloAm;
   }

   public void setIndPoloAm(String indPoloAm) {
        markAsChanged("INDPOLOAM", indPoloAm);
        this.indPoloAm = indPoloAm;
   }

   public String getIndPartExt() {
        return indPartExt;
   }

   public void setIndPartExt(String indPartExt) {
        markAsChanged("INDPARTEXT", indPartExt);
        this.indPartExt = indPartExt;
   }

   public String getIndRoyRec() {
        return indRoyRec;
   }

   public void setIndRoyRec(String indRoyRec) {
        markAsChanged("INDROYREC", indRoyRec);
        this.indRoyRec = indRoyRec;
   }

   public String getIndLucExp() {
        return indLucExp;
   }

   public void setIndLucExp(String indLucExp) {
        markAsChanged("INDLUCEXP", indLucExp);
        this.indLucExp = indLucExp;
   }

   public String getIndAtivExt() {
        return indAtivExt;
   }

   public void setIndAtivExt(String indAtivExt) {
        markAsChanged("INDATIVEXT", indAtivExt);
        this.indAtivExt = indAtivExt;
   }

   public String getIndPartColig() {
        return indPartColig;
   }

   public void setIndPartColig(String indPartColig) {
        markAsChanged("INDPARTCOLIG", indPartColig);
        this.indPartColig = indPartColig;
   }

   public String getIndPgtoExt() {
        return indPgtoExt;
   }

   public void setIndPgtoExt(String indPgtoExt) {
        markAsChanged("INDPGTOEXT", indPgtoExt);
        this.indPgtoExt = indPgtoExt;
   }

   public String getIndFin() {
        return indFin;
   }

   public void setIndFin(String indFin) {
        markAsChanged("INDFIN", indFin);
        this.indFin = indFin;
   }

   public String getIndRendServ() {
        return indRendServ;
   }

   public void setIndRendServ(String indRendServ) {
        markAsChanged("INDRENDSERV", indRendServ);
        this.indRendServ = indRendServ;
   }

   public String getIndZonExp() {
        return indZonExp;
   }

   public void setIndZonExp(String indZonExp) {
        markAsChanged("INDZONEXP", indZonExp);
        this.indZonExp = indZonExp;
   }

   public String getIndPartCons() {
        return indPartCons;
   }

   public void setIndPartCons(String indPartCons) {
        markAsChanged("INDPARTCONS", indPartCons);
        this.indPartCons = indPartCons;
   }

   public String getIndOpVinc() {
        return indOpVinc;
   }

   public void setIndOpVinc(String indOpVinc) {
        markAsChanged("INDOPVINC", indOpVinc);
        this.indOpVinc = indOpVinc;
   }

   public String getIndRecExt() {
        return indRecExt;
   }

   public void setIndRecExt(String indRecExt) {
        markAsChanged("INDRECEXT", indRecExt);
        this.indRecExt = indRecExt;
   }

   public String getIndAliqCsll() {
        return indAliqCsll;
   }

   public void setIndAliqCsll(String indAliqCsll) {
        markAsChanged("INDALIQCSLL", indAliqCsll);
        this.indAliqCsll = indAliqCsll;
   }

   public String getIndPjHab() {
        return indPjHab;
   }

   public void setIndPjHab(String indPjHab) {
        markAsChanged("INDPJHAB", indPjHab);
        this.indPjHab = indPjHab;
   }

   public String getIndInovTec() {
        return indInovTec;
   }

   public void setIndInovTec(String indInovTec) {
        markAsChanged("INDINOVTEC", indInovTec);
        this.indInovTec = indInovTec;
   }

   public String getIndAtivRural() {
        return indAtivRural;
   }

   public void setIndAtivRural(String indAtivRural) {
        markAsChanged("INDATIVRURAL", indAtivRural);
        this.indAtivRural = indAtivRural;
   }

   public String getIndRedisen() {
        return indRedisen;
   }

   public void setIndRedisen(String indRedisen) {
        markAsChanged("INDREDISEN", indRedisen);
        this.indRedisen = indRedisen;
   }

   public String getIndRoyPag() {
        return indRoyPag;
   }

   public void setIndRoyPag(String indRoyPag) {
        markAsChanged("INDROYPAG", indRoyPag);
        this.indRoyPag = indRoyPag;
   }

   public String getIndEcomTi() {
        return indEcomTi;
   }

   public void setIndEcomTi(String indEcomTi) {
        markAsChanged("INDECOMTI", indEcomTi);
        this.indEcomTi = indEcomTi;
   }

   public String getIndComExp() {
        return indComExp;
   }

   public void setIndComExp(String indComExp) {
        markAsChanged("INDCOMEXP", indComExp);
        this.indComExp = indComExp;
   }

   public String getIndDoaEleit() {
        return indDoaEleit;
   }

   public void setIndDoaEleit(String indDoaEleit) {
        markAsChanged("INDDOAELEIT", indDoaEleit);
        this.indDoaEleit = indDoaEleit;
   }

   public String getIndPgtoRem() {
        return indPgtoRem;
   }

   public void setIndPgtoRem(String indPgtoRem) {
        markAsChanged("INDPGTOREM", indPgtoRem);
        this.indPgtoRem = indPgtoRem;
   }

   public String getTipEscPre() {
        return tipEscPre;
   }

   public void setTipEscPre(String tipEscPre) {
        markAsChanged("TIPESCPRE", tipEscPre);
        this.tipEscPre = tipEscPre;
   }

   public String getApurCsll() {
        return apurCsll;
   }

   public void setApurCsll(String apurCsll) {
        markAsChanged("APURCSLL", apurCsll);
        this.apurCsll = apurCsll;
   }

   public String getFormaApuri() {
        return formaApuri;
   }

   public void setFormaApuri(String formaApuri) {
        markAsChanged("FORMAAPURI", formaApuri);
        this.formaApuri = formaApuri;
   }

   public String getTipEnt() {
        return tipEnt;
   }

   public void setTipEnt(String tipEnt) {
        markAsChanged("TIPENT", tipEnt);
        this.tipEnt = tipEnt;
   }

   public String getOptRefis() {
        return optRefis;
   }

   public void setOptRefis(String optRefis) {
        markAsChanged("OPTREFIS", optRefis);
        this.optRefis = optRefis;
   }

   public String getFormaApur() {
        return formaApur;
   }

   public void setFormaApur(String formaApur) {
        markAsChanged("FORMAAPUR", formaApur);
        this.formaApur = formaApur;
   }

   public String getGerRegJperAnual() {
        return gerRegJperAnual;
   }

   public void setGerRegJperAnual(String gerRegJperAnual) {
        markAsChanged("GERREGJPERANUAL", gerRegJperAnual);
        this.gerRegJperAnual = gerRegJperAnual;
   }

   public String getIndEbas() {
        return indEbas;
   }

   public void setIndEbas(String indEbas) {
        markAsChanged("INDEBAS", indEbas);
        this.indEbas = indEbas;
   }

   public String getIndOleoBunker() {
        return indOleoBunker;
   }

   public void setIndOleoBunker(String indOleoBunker) {
        markAsChanged("INDOLEOBUNKER", indOleoBunker);
        this.indOleoBunker = indOleoBunker;
   }

   public String getIndRepEper() {
        return indRepEper;
   }

   public void setIndRepEper(String indRepEper) {
        markAsChanged("INDREPEPER", indRepEper);
        this.indRepEper = indRepEper;
   }

   public String getIndRepEpetroInd() {
        return indRepEpetroInd;
   }

   public void setIndRepEpetroInd(String indRepEpetroInd) {
        markAsChanged("INDREPETROIND", indRepEpetroInd);
        this.indRepEpetroInd = indRepEpetroInd;
   }

   public String getIndRepEpetroNac() {
        return indRepEpetroNac;
   }

   public void setIndRepEpetroNac(String indRepEpetroNac) {
        markAsChanged("INDREPETRONAC", indRepEpetroNac);
        this.indRepEpetroNac = indRepEpetroNac;
   }

   public String getIndRepEpetroTemp() {
        return indRepEpetroTemp;
   }

   public void setIndRepEpetroTemp(String indRepEpetroTemp) {
        markAsChanged("INDREPETROTEMP", indRepEpetroTemp);
        this.indRepEpetroTemp = indRepEpetroTemp;
   }

   public String getIndRepOrto() {
        return indRepOrto;
   }

   public void setIndRepOrto(String indRepOrto) {
        markAsChanged("INDREPORTO", indRepOrto);
        this.indRepOrto = indRepOrto;
   }

   public String getIndRetEei() {
        return indRetEei;
   }

   public void setIndRetEei(String indRetEei) {
        markAsChanged("INDRETEEI", indRetEei);
        this.indRetEei = indRetEei;
   }

   public String getIndRetIi() {
        return indRetIi;
   }

   public void setIndRetIi(String indRetIi) {
        markAsChanged("INDRETII", indRetIi);
        this.indRetIi = indRetIi;
   }

   public String getIndRetPmcmv() {
        return indRetPmcmv;
   }

   public void setIndRetPmcmv(String indRetPmcmv) {
        markAsChanged("INDRETPMCMV", indRetPmcmv);
        this.indRetPmcmv = indRetPmcmv;
   }

   public String getOpcPtrf2023() {
        return opcPtrf2023;
   }

   public void setOpcPtrf2023(String opcPtrf2023) {
        markAsChanged("OPCPTRF2023", opcPtrf2023);
        this.opcPtrf2023 = opcPtrf2023;
   }

   @Override
   public String getTableName() {
        return "TCBEMP";
   }

   @Override
   public String getEntityName() {
        return "EmpresaContabilidade";
   }

   @Override
   public EmpresaContabilidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.aceitarHistZero = vo.asString("ACEITARHISTZERO");
        this.aceitarVlrLanc = vo.asString("ACEITARVLRLANC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpPlacta = vo.asBigDecimal("CODEMPPLACTA");
        this.contador = vo.asString("CONTADOR");
        this.crc = vo.asString("CRC");
        this.ctarEdaut = vo.asString("CTAREDAUT");
        this.digCta = vo.asString("DIGCTA");
        this.dtAbertura = vo.asTimestamp("DTABERTURA");
        this.dtFimPerCtb = vo.asTimestamp("DTFIMPERCTB");
        this.dtInicPerCtb = vo.asTimestamp("DTINICPERCTB");
        this.empConsolida = vo.asString("EMPCONSOLIDA");
        this.mascCta = vo.asString("MASCCTA");
        this.nroLoteMnualFim = vo.asBigDecimal("NROLOTEMNUALFIM");
        this.nroLoteMnualIni = vo.asBigDecimal("NROLOTEMNUALINI");
        this.numDiario = vo.asBigDecimal("NUMDIARIO");
        this.numLotesAut = vo.asString("NUMLOTESAUT");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.simbVlrNeg = vo.asString("SIMBVLRNEG");
        this.tipAtualSaldos = vo.asString("TIPATUALSALDOS");
        this.ultPagDiario = vo.asBigDecimal("ULTPAGDIARIO");
        this.utilCencus = vo.asString("UTILCENCUS");
        this.utilProj = vo.asString("UTILPROJ");
        this.perAltQdCom = vo.asString("PERALTQDCOM");
        this.codCtaCtbEncRes = vo.asBigDecimal("CODCTACTBENCRES");
        this.ufCrcContador = vo.asString("UFCRCCONTADOR");
        this.codInstResp = vo.asString("CODINSTRESP");
        this.ultimoNumeroUsado = vo.asBigDecimal("ULTIMONUMEROUSADO");
        this.nroOrdem = vo.asBigDecimal("NROORDEM");
        this.nroOrdemR = vo.asBigDecimal("NROORDEM_R");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.percRateio = vo.asBigDecimal("PERCRATEIO");
        this.empCopPla = vo.asBigDecimal("EMPCOPPLA");
        this.tipPeriodo = vo.asString("TIPPERIODO");
        this.cabDem = vo.asString("CABDEM");
        this.arqLogoMarca = vo.asString("ARQLOGOMARCA");
        this.usaEmpAuxCtbz = vo.asString("USAEMPAUXCTBZ");
        this.derEx = vo.asString("DEREX");
        this.indRecReceita = vo.asBigDecimal("INDRECRECEITA");
        this.indPaisaPais = vo.asString("INDPAISAPAIS");
        this.indRetid = vo.asString("INDRETID");
        this.indResiduosSolid = vo.asString("INDRESIDUOSSOLID");
        this.indRecOpa = vo.asString("INDRECOPA");
        this.indCopadomundo = vo.asString("INDCOPADOMUNDO");
        this.indOlimpiadas = vo.asString("INDOLIMPIADAS");
        this.indRepNblRedes = vo.asString("INDREPNBLREDES");
        this.indReif = vo.asString("INDREIF");
        this.indRetAero = vo.asString("INDRETAERO");
        this.indRecine = vo.asString("INDRECINE");
        this.indRepEnec = vo.asString("INDREPENEC");
        this.indReicomP = vo.asString("INDREICOMP");
        this.indPadis = vo.asString("INDPADIS");
        this.indRecap = vo.asString("INDRECAP");
        this.indPatvd = vo.asString("INDPATVD");
        this.indRepes = vo.asString("INDREPES");
        this.indReidi = vo.asString("INDREIDI");
        this.indMudancPc = vo.asBigDecimal("INDMUDANCPC");
        this.pjSujeitaCsll = vo.asString("PJSUJEITACSLL");
        this.diffCont = vo.asString("DIFFCONT");
        this.formatRib = vo.asBigDecimal("FORMATRIB");
        this.optExtRtt = vo.asString("OPTEXTRTT");
        this.optPaes = vo.asString("OPTPAES");
        this.indAreaCom = vo.asString("INDAREACOM");
        this.indOpExt = vo.asString("INDOPEXT");
        this.indVendExp = vo.asString("INDVENDEXP");
        this.indPjEnquad = vo.asString("INDPJENQUAD");
        this.tpoEmpresa = vo.asBigDecimal("TPOEMPRESA");
        this.indAdmFuncLu = vo.asString("INDADMFUNCLU");
        this.indCapInf = vo.asString("INDCAPINF");
        this.indPoloAm = vo.asString("INDPOLOAM");
        this.indPartExt = vo.asString("INDPARTEXT");
        this.indRoyRec = vo.asString("INDROYREC");
        this.indLucExp = vo.asString("INDLUCEXP");
        this.indAtivExt = vo.asString("INDATIVEXT");
        this.indPartColig = vo.asString("INDPARTCOLIG");
        this.indPgtoExt = vo.asString("INDPGTOEXT");
        this.indFin = vo.asString("INDFIN");
        this.indRendServ = vo.asString("INDRENDSERV");
        this.indZonExp = vo.asString("INDZONEXP");
        this.indPartCons = vo.asString("INDPARTCONS");
        this.indOpVinc = vo.asString("INDOPVINC");
        this.indRecExt = vo.asString("INDRECEXT");
        this.indAliqCsll = vo.asString("INDALIQCSLL");
        this.indPjHab = vo.asString("INDPJHAB");
        this.indInovTec = vo.asString("INDINOVTEC");
        this.indAtivRural = vo.asString("INDATIVRURAL");
        this.indRedisen = vo.asString("INDREDISEN");
        this.indRoyPag = vo.asString("INDROYPAG");
        this.indEcomTi = vo.asString("INDECOMTI");
        this.indComExp = vo.asString("INDCOMEXP");
        this.indDoaEleit = vo.asString("INDDOAELEIT");
        this.indPgtoRem = vo.asString("INDPGTOREM");
        this.tipEscPre = vo.asString("TIPESCPRE");
        this.apurCsll = vo.asString("APURCSLL");
        this.formaApuri = vo.asString("FORMAAPURI");
        this.tipEnt = vo.asString("TIPENT");
        this.optRefis = vo.asString("OPTREFIS");
        this.formaApur = vo.asString("FORMAAPUR");
        this.gerRegJperAnual = vo.asString("GERREGJPERANUAL");
        this.indEbas = vo.asString("INDEBAS");
        this.indOleoBunker = vo.asString("INDOLEOBUNKER");
        this.indRepEper = vo.asString("INDREPEPER");
        this.indRepEpetroInd = vo.asString("INDREPETROIND");
        this.indRepEpetroNac = vo.asString("INDREPETRONAC");
        this.indRepEpetroTemp = vo.asString("INDREPETROTEMP");
        this.indRepOrto = vo.asString("INDREPORTO");
        this.indRetEei = vo.asString("INDRETEEI");
        this.indRetIi = vo.asString("INDRETII");
        this.indRetPmcmv = vo.asString("INDRETPMCMV");
        this.opcPtrf2023 = vo.asString("OPCPTRF2023");
        return this;
   }
}
