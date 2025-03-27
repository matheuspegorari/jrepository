package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaContabilidade extends AbstractSankhyaEntity<EmpresaContabilidade> {
   public String getAceitarHistZero() {
        return this.getVo().asString("ACEITARHISTZERO");
   }

   public void setAceitarHistZero(String aceitarHistZero) {
        markAsChanged("ACEITARHISTZERO", aceitarHistZero);
   }

   public String getAceitarVlrLanc() {
        return this.getVo().asString("ACEITARVLRLANC");
   }

   public void setAceitarVlrLanc(String aceitarVlrLanc) {
        markAsChanged("ACEITARVLRLANC", aceitarVlrLanc);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpPlacta() {
        return this.getVo().asBigDecimal("CODEMPPLACTA");
   }

   public void setCodEmpPlacta(BigDecimal codEmpPlacta) {
        markAsChanged("CODEMPPLACTA", codEmpPlacta);
   }

   public String getContador() {
        return this.getVo().asString("CONTADOR");
   }

   public void setContador(String contador) {
        markAsChanged("CONTADOR", contador);
   }

   public String getCrc() {
        return this.getVo().asString("CRC");
   }

   public void setCrc(String crc) {
        markAsChanged("CRC", crc);
   }

   public String getCtarEdaut() {
        return this.getVo().asString("CTAREDAUT");
   }

   public void setCtarEdaut(String ctarEdaut) {
        markAsChanged("CTAREDAUT", ctarEdaut);
   }

   public String getDigCta() {
        return this.getVo().asString("DIGCTA");
   }

   public void setDigCta(String digCta) {
        markAsChanged("DIGCTA", digCta);
   }

   public Timestamp getDtAbertura() {
        return this.getVo().asTimestamp("DTABERTURA");
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        markAsChanged("DTABERTURA", dtAbertura);
   }

   public Timestamp getDtFimPerCtb() {
        return this.getVo().asTimestamp("DTFIMPERCTB");
   }

   public void setDtFimPerCtb(Timestamp dtFimPerCtb) {
        markAsChanged("DTFIMPERCTB", dtFimPerCtb);
   }

   public Timestamp getDtInicPerCtb() {
        return this.getVo().asTimestamp("DTINICPERCTB");
   }

   public void setDtInicPerCtb(Timestamp dtInicPerCtb) {
        markAsChanged("DTINICPERCTB", dtInicPerCtb);
   }

   public String getEmpConsolida() {
        return this.getVo().asString("EMPCONSOLIDA");
   }

   public void setEmpConsolida(String empConsolida) {
        markAsChanged("EMPCONSOLIDA", empConsolida);
   }

   public String getMascCta() {
        return this.getVo().asString("MASCCTA");
   }

   public void setMascCta(String mascCta) {
        markAsChanged("MASCCTA", mascCta);
   }

   public BigDecimal getNroLoteMnualFim() {
        return this.getVo().asBigDecimal("NROLOTEMNUALFIM");
   }

   public void setNroLoteMnualFim(BigDecimal nroLoteMnualFim) {
        markAsChanged("NROLOTEMNUALFIM", nroLoteMnualFim);
   }

   public BigDecimal getNroLoteMnualIni() {
        return this.getVo().asBigDecimal("NROLOTEMNUALINI");
   }

   public void setNroLoteMnualIni(BigDecimal nroLoteMnualIni) {
        markAsChanged("NROLOTEMNUALINI", nroLoteMnualIni);
   }

   public BigDecimal getNumDiario() {
        return this.getVo().asBigDecimal("NUMDIARIO");
   }

   public void setNumDiario(BigDecimal numDiario) {
        markAsChanged("NUMDIARIO", numDiario);
   }

   public String getNumLotesAut() {
        return this.getVo().asString("NUMLOTESAUT");
   }

   public void setNumLotesAut(String numLotesAut) {
        markAsChanged("NUMLOTESAUT", numLotesAut);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getSimbVlrNeg() {
        return this.getVo().asString("SIMBVLRNEG");
   }

   public void setSimbVlrNeg(String simbVlrNeg) {
        markAsChanged("SIMBVLRNEG", simbVlrNeg);
   }

   public String getTipAtualSaldos() {
        return this.getVo().asString("TIPATUALSALDOS");
   }

   public void setTipAtualSaldos(String tipAtualSaldos) {
        markAsChanged("TIPATUALSALDOS", tipAtualSaldos);
   }

   public BigDecimal getUltPagDiario() {
        return this.getVo().asBigDecimal("ULTPAGDIARIO");
   }

   public void setUltPagDiario(BigDecimal ultPagDiario) {
        markAsChanged("ULTPAGDIARIO", ultPagDiario);
   }

   public String getUtilCencus() {
        return this.getVo().asString("UTILCENCUS");
   }

   public void setUtilCencus(String utilCencus) {
        markAsChanged("UTILCENCUS", utilCencus);
   }

   public String getUtilProj() {
        return this.getVo().asString("UTILPROJ");
   }

   public void setUtilProj(String utilProj) {
        markAsChanged("UTILPROJ", utilProj);
   }

   public String getPerAltQdCom() {
        return this.getVo().asString("PERALTQDCOM");
   }

   public void setPerAltQdCom(String perAltQdCom) {
        markAsChanged("PERALTQDCOM", perAltQdCom);
   }

   public BigDecimal getCodCtaCtbEncRes() {
        return this.getVo().asBigDecimal("CODCTACTBENCRES");
   }

   public void setCodCtaCtbEncRes(BigDecimal codCtaCtbEncRes) {
        markAsChanged("CODCTACTBENCRES", codCtaCtbEncRes);
   }

   public String getUfCrcContador() {
        return this.getVo().asString("UFCRCCONTADOR");
   }

   public void setUfCrcContador(String ufCrcContador) {
        markAsChanged("UFCRCCONTADOR", ufCrcContador);
   }

   public String getCodInstResp() {
        return this.getVo().asString("CODINSTRESP");
   }

   public void setCodInstResp(String codInstResp) {
        markAsChanged("CODINSTRESP", codInstResp);
   }

   public BigDecimal getUltimoNumeroUsado() {
        return this.getVo().asBigDecimal("ULTIMONUMEROUSADO");
   }

   public void setUltimoNumeroUsado(BigDecimal ultimoNumeroUsado) {
        markAsChanged("ULTIMONUMEROUSADO", ultimoNumeroUsado);
   }

   public BigDecimal getNroOrdem() {
        return this.getVo().asBigDecimal("NROORDEM");
   }

   public void setNroOrdem(BigDecimal nroOrdem) {
        markAsChanged("NROORDEM", nroOrdem);
   }

   public BigDecimal getNroOrdemR() {
        return this.getVo().asBigDecimal("NROORDEM_R");
   }

   public void setNroOrdemR(BigDecimal nroOrdemR) {
        markAsChanged("NROORDEM_R", nroOrdemR);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public BigDecimal getPercRateio() {
        return this.getVo().asBigDecimal("PERCRATEIO");
   }

   public void setPercRateio(BigDecimal percRateio) {
        markAsChanged("PERCRATEIO", percRateio);
   }

   public BigDecimal getEmpCopPla() {
        return this.getVo().asBigDecimal("EMPCOPPLA");
   }

   public void setEmpCopPla(BigDecimal empCopPla) {
        markAsChanged("EMPCOPPLA", empCopPla);
   }

   public String getTipPeriodo() {
        return this.getVo().asString("TIPPERIODO");
   }

   public void setTipPeriodo(String tipPeriodo) {
        markAsChanged("TIPPERIODO", tipPeriodo);
   }

   public String getCabDem() {
        return this.getVo().asString("CABDEM");
   }

   public void setCabDem(String cabDem) {
        markAsChanged("CABDEM", cabDem);
   }

   public String getArqLogoMarca() {
        return this.getVo().asString("ARQLOGOMARCA");
   }

   public void setArqLogoMarca(String arqLogoMarca) {
        markAsChanged("ARQLOGOMARCA", arqLogoMarca);
   }

   public String getUsaEmpAuxCtbz() {
        return this.getVo().asString("USAEMPAUXCTBZ");
   }

   public void setUsaEmpAuxCtbz(String usaEmpAuxCtbz) {
        markAsChanged("USAEMPAUXCTBZ", usaEmpAuxCtbz);
   }

   public String getDerEx() {
        return this.getVo().asString("DEREX");
   }

   public void setDerEx(String derEx) {
        markAsChanged("DEREX", derEx);
   }

   public BigDecimal getIndRecReceita() {
        return this.getVo().asBigDecimal("INDRECRECEITA");
   }

   public void setIndRecReceita(BigDecimal indRecReceita) {
        markAsChanged("INDRECRECEITA", indRecReceita);
   }

   public String getIndPaisaPais() {
        return this.getVo().asString("INDPAISAPAIS");
   }

   public void setIndPaisaPais(String indPaisaPais) {
        markAsChanged("INDPAISAPAIS", indPaisaPais);
   }

   public String getIndRetid() {
        return this.getVo().asString("INDRETID");
   }

   public void setIndRetid(String indRetid) {
        markAsChanged("INDRETID", indRetid);
   }

   public String getIndResiduosSolid() {
        return this.getVo().asString("INDRESIDUOSSOLID");
   }

   public void setIndResiduosSolid(String indResiduosSolid) {
        markAsChanged("INDRESIDUOSSOLID", indResiduosSolid);
   }

   public String getIndRecOpa() {
        return this.getVo().asString("INDRECOPA");
   }

   public void setIndRecOpa(String indRecOpa) {
        markAsChanged("INDRECOPA", indRecOpa);
   }

   public String getIndCopadomundo() {
        return this.getVo().asString("INDCOPADOMUNDO");
   }

   public void setIndCopadomundo(String indCopadomundo) {
        markAsChanged("INDCOPADOMUNDO", indCopadomundo);
   }

   public String getIndOlimpiadas() {
        return this.getVo().asString("INDOLIMPIADAS");
   }

   public void setIndOlimpiadas(String indOlimpiadas) {
        markAsChanged("INDOLIMPIADAS", indOlimpiadas);
   }

   public String getIndRepNblRedes() {
        return this.getVo().asString("INDREPNBLREDES");
   }

   public void setIndRepNblRedes(String indRepNblRedes) {
        markAsChanged("INDREPNBLREDES", indRepNblRedes);
   }

   public String getIndReif() {
        return this.getVo().asString("INDREIF");
   }

   public void setIndReif(String indReif) {
        markAsChanged("INDREIF", indReif);
   }

   public String getIndRetAero() {
        return this.getVo().asString("INDRETAERO");
   }

   public void setIndRetAero(String indRetAero) {
        markAsChanged("INDRETAERO", indRetAero);
   }

   public String getIndRecine() {
        return this.getVo().asString("INDRECINE");
   }

   public void setIndRecine(String indRecine) {
        markAsChanged("INDRECINE", indRecine);
   }

   public String getIndRepEnec() {
        return this.getVo().asString("INDREPENEC");
   }

   public void setIndRepEnec(String indRepEnec) {
        markAsChanged("INDREPENEC", indRepEnec);
   }

   public String getIndReicomP() {
        return this.getVo().asString("INDREICOMP");
   }

   public void setIndReicomP(String indReicomP) {
        markAsChanged("INDREICOMP", indReicomP);
   }

   public String getIndPadis() {
        return this.getVo().asString("INDPADIS");
   }

   public void setIndPadis(String indPadis) {
        markAsChanged("INDPADIS", indPadis);
   }

   public String getIndRecap() {
        return this.getVo().asString("INDRECAP");
   }

   public void setIndRecap(String indRecap) {
        markAsChanged("INDRECAP", indRecap);
   }

   public String getIndPatvd() {
        return this.getVo().asString("INDPATVD");
   }

   public void setIndPatvd(String indPatvd) {
        markAsChanged("INDPATVD", indPatvd);
   }

   public String getIndRepes() {
        return this.getVo().asString("INDREPES");
   }

   public void setIndRepes(String indRepes) {
        markAsChanged("INDREPES", indRepes);
   }

   public String getIndReidi() {
        return this.getVo().asString("INDREIDI");
   }

   public void setIndReidi(String indReidi) {
        markAsChanged("INDREIDI", indReidi);
   }

   public BigDecimal getIndMudancPc() {
        return this.getVo().asBigDecimal("INDMUDANCPC");
   }

   public void setIndMudancPc(BigDecimal indMudancPc) {
        markAsChanged("INDMUDANCPC", indMudancPc);
   }

   public String getPjSujeitaCsll() {
        return this.getVo().asString("PJSUJEITACSLL");
   }

   public void setPjSujeitaCsll(String pjSujeitaCsll) {
        markAsChanged("PJSUJEITACSLL", pjSujeitaCsll);
   }

   public String getDiffCont() {
        return this.getVo().asString("DIFFCONT");
   }

   public void setDiffCont(String diffCont) {
        markAsChanged("DIFFCONT", diffCont);
   }

   public BigDecimal getFormatRib() {
        return this.getVo().asBigDecimal("FORMATRIB");
   }

   public void setFormatRib(BigDecimal formatRib) {
        markAsChanged("FORMATRIB", formatRib);
   }

   public String getOptExtRtt() {
        return this.getVo().asString("OPTEXTRTT");
   }

   public void setOptExtRtt(String optExtRtt) {
        markAsChanged("OPTEXTRTT", optExtRtt);
   }

   public String getOptPaes() {
        return this.getVo().asString("OPTPAES");
   }

   public void setOptPaes(String optPaes) {
        markAsChanged("OPTPAES", optPaes);
   }

   public String getIndAreaCom() {
        return this.getVo().asString("INDAREACOM");
   }

   public void setIndAreaCom(String indAreaCom) {
        markAsChanged("INDAREACOM", indAreaCom);
   }

   public String getIndOpExt() {
        return this.getVo().asString("INDOPEXT");
   }

   public void setIndOpExt(String indOpExt) {
        markAsChanged("INDOPEXT", indOpExt);
   }

   public String getIndVendExp() {
        return this.getVo().asString("INDVENDEXP");
   }

   public void setIndVendExp(String indVendExp) {
        markAsChanged("INDVENDEXP", indVendExp);
   }

   public String getIndPjEnquad() {
        return this.getVo().asString("INDPJENQUAD");
   }

   public void setIndPjEnquad(String indPjEnquad) {
        markAsChanged("INDPJENQUAD", indPjEnquad);
   }

   public BigDecimal getTpoEmpresa() {
        return this.getVo().asBigDecimal("TPOEMPRESA");
   }

   public void setTpoEmpresa(BigDecimal tpoEmpresa) {
        markAsChanged("TPOEMPRESA", tpoEmpresa);
   }

   public String getIndAdmFuncLu() {
        return this.getVo().asString("INDADMFUNCLU");
   }

   public void setIndAdmFuncLu(String indAdmFuncLu) {
        markAsChanged("INDADMFUNCLU", indAdmFuncLu);
   }

   public String getIndCapInf() {
        return this.getVo().asString("INDCAPINF");
   }

   public void setIndCapInf(String indCapInf) {
        markAsChanged("INDCAPINF", indCapInf);
   }

   public String getIndPoloAm() {
        return this.getVo().asString("INDPOLOAM");
   }

   public void setIndPoloAm(String indPoloAm) {
        markAsChanged("INDPOLOAM", indPoloAm);
   }

   public String getIndPartExt() {
        return this.getVo().asString("INDPARTEXT");
   }

   public void setIndPartExt(String indPartExt) {
        markAsChanged("INDPARTEXT", indPartExt);
   }

   public String getIndRoyRec() {
        return this.getVo().asString("INDROYREC");
   }

   public void setIndRoyRec(String indRoyRec) {
        markAsChanged("INDROYREC", indRoyRec);
   }

   public String getIndLucExp() {
        return this.getVo().asString("INDLUCEXP");
   }

   public void setIndLucExp(String indLucExp) {
        markAsChanged("INDLUCEXP", indLucExp);
   }

   public String getIndAtivExt() {
        return this.getVo().asString("INDATIVEXT");
   }

   public void setIndAtivExt(String indAtivExt) {
        markAsChanged("INDATIVEXT", indAtivExt);
   }

   public String getIndPartColig() {
        return this.getVo().asString("INDPARTCOLIG");
   }

   public void setIndPartColig(String indPartColig) {
        markAsChanged("INDPARTCOLIG", indPartColig);
   }

   public String getIndPgtoExt() {
        return this.getVo().asString("INDPGTOEXT");
   }

   public void setIndPgtoExt(String indPgtoExt) {
        markAsChanged("INDPGTOEXT", indPgtoExt);
   }

   public String getIndFin() {
        return this.getVo().asString("INDFIN");
   }

   public void setIndFin(String indFin) {
        markAsChanged("INDFIN", indFin);
   }

   public String getIndRendServ() {
        return this.getVo().asString("INDRENDSERV");
   }

   public void setIndRendServ(String indRendServ) {
        markAsChanged("INDRENDSERV", indRendServ);
   }

   public String getIndZonExp() {
        return this.getVo().asString("INDZONEXP");
   }

   public void setIndZonExp(String indZonExp) {
        markAsChanged("INDZONEXP", indZonExp);
   }

   public String getIndPartCons() {
        return this.getVo().asString("INDPARTCONS");
   }

   public void setIndPartCons(String indPartCons) {
        markAsChanged("INDPARTCONS", indPartCons);
   }

   public String getIndOpVinc() {
        return this.getVo().asString("INDOPVINC");
   }

   public void setIndOpVinc(String indOpVinc) {
        markAsChanged("INDOPVINC", indOpVinc);
   }

   public String getIndRecExt() {
        return this.getVo().asString("INDRECEXT");
   }

   public void setIndRecExt(String indRecExt) {
        markAsChanged("INDRECEXT", indRecExt);
   }

   public String getIndAliqCsll() {
        return this.getVo().asString("INDALIQCSLL");
   }

   public void setIndAliqCsll(String indAliqCsll) {
        markAsChanged("INDALIQCSLL", indAliqCsll);
   }

   public String getIndPjHab() {
        return this.getVo().asString("INDPJHAB");
   }

   public void setIndPjHab(String indPjHab) {
        markAsChanged("INDPJHAB", indPjHab);
   }

   public String getIndInovTec() {
        return this.getVo().asString("INDINOVTEC");
   }

   public void setIndInovTec(String indInovTec) {
        markAsChanged("INDINOVTEC", indInovTec);
   }

   public String getIndAtivRural() {
        return this.getVo().asString("INDATIVRURAL");
   }

   public void setIndAtivRural(String indAtivRural) {
        markAsChanged("INDATIVRURAL", indAtivRural);
   }

   public String getIndRedisen() {
        return this.getVo().asString("INDREDISEN");
   }

   public void setIndRedisen(String indRedisen) {
        markAsChanged("INDREDISEN", indRedisen);
   }

   public String getIndRoyPag() {
        return this.getVo().asString("INDROYPAG");
   }

   public void setIndRoyPag(String indRoyPag) {
        markAsChanged("INDROYPAG", indRoyPag);
   }

   public String getIndEcomTi() {
        return this.getVo().asString("INDECOMTI");
   }

   public void setIndEcomTi(String indEcomTi) {
        markAsChanged("INDECOMTI", indEcomTi);
   }

   public String getIndComExp() {
        return this.getVo().asString("INDCOMEXP");
   }

   public void setIndComExp(String indComExp) {
        markAsChanged("INDCOMEXP", indComExp);
   }

   public String getIndDoaEleit() {
        return this.getVo().asString("INDDOAELEIT");
   }

   public void setIndDoaEleit(String indDoaEleit) {
        markAsChanged("INDDOAELEIT", indDoaEleit);
   }

   public String getIndPgtoRem() {
        return this.getVo().asString("INDPGTOREM");
   }

   public void setIndPgtoRem(String indPgtoRem) {
        markAsChanged("INDPGTOREM", indPgtoRem);
   }

   public String getTipEscPre() {
        return this.getVo().asString("TIPESCPRE");
   }

   public void setTipEscPre(String tipEscPre) {
        markAsChanged("TIPESCPRE", tipEscPre);
   }

   public String getApurCsll() {
        return this.getVo().asString("APURCSLL");
   }

   public void setApurCsll(String apurCsll) {
        markAsChanged("APURCSLL", apurCsll);
   }

   public String getFormaApuri() {
        return this.getVo().asString("FORMAAPURI");
   }

   public void setFormaApuri(String formaApuri) {
        markAsChanged("FORMAAPURI", formaApuri);
   }

   public String getTipEnt() {
        return this.getVo().asString("TIPENT");
   }

   public void setTipEnt(String tipEnt) {
        markAsChanged("TIPENT", tipEnt);
   }

   public String getOptRefis() {
        return this.getVo().asString("OPTREFIS");
   }

   public void setOptRefis(String optRefis) {
        markAsChanged("OPTREFIS", optRefis);
   }

   public String getFormaApur() {
        return this.getVo().asString("FORMAAPUR");
   }

   public void setFormaApur(String formaApur) {
        markAsChanged("FORMAAPUR", formaApur);
   }

   public String getGerRegJperAnual() {
        return this.getVo().asString("GERREGJPERANUAL");
   }

   public void setGerRegJperAnual(String gerRegJperAnual) {
        markAsChanged("GERREGJPERANUAL", gerRegJperAnual);
   }

   public String getIndEbas() {
        return this.getVo().asString("INDEBAS");
   }

   public void setIndEbas(String indEbas) {
        markAsChanged("INDEBAS", indEbas);
   }

   public String getIndOleoBunker() {
        return this.getVo().asString("INDOLEOBUNKER");
   }

   public void setIndOleoBunker(String indOleoBunker) {
        markAsChanged("INDOLEOBUNKER", indOleoBunker);
   }

   public String getIndRepEper() {
        return this.getVo().asString("INDREPEPER");
   }

   public void setIndRepEper(String indRepEper) {
        markAsChanged("INDREPEPER", indRepEper);
   }

   public String getIndRepEpetroInd() {
        return this.getVo().asString("INDREPETROIND");
   }

   public void setIndRepEpetroInd(String indRepEpetroInd) {
        markAsChanged("INDREPETROIND", indRepEpetroInd);
   }

   public String getIndRepEpetroNac() {
        return this.getVo().asString("INDREPETRONAC");
   }

   public void setIndRepEpetroNac(String indRepEpetroNac) {
        markAsChanged("INDREPETRONAC", indRepEpetroNac);
   }

   public String getIndRepEpetroTemp() {
        return this.getVo().asString("INDREPETROTEMP");
   }

   public void setIndRepEpetroTemp(String indRepEpetroTemp) {
        markAsChanged("INDREPETROTEMP", indRepEpetroTemp);
   }

   public String getIndRepOrto() {
        return this.getVo().asString("INDREPORTO");
   }

   public void setIndRepOrto(String indRepOrto) {
        markAsChanged("INDREPORTO", indRepOrto);
   }

   public String getIndRetEei() {
        return this.getVo().asString("INDRETEEI");
   }

   public void setIndRetEei(String indRetEei) {
        markAsChanged("INDRETEEI", indRetEei);
   }

   public String getIndRetIi() {
        return this.getVo().asString("INDRETII");
   }

   public void setIndRetIi(String indRetIi) {
        markAsChanged("INDRETII", indRetIi);
   }

   public String getIndRetPmcmv() {
        return this.getVo().asString("INDRETPMCMV");
   }

   public void setIndRetPmcmv(String indRetPmcmv) {
        markAsChanged("INDRETPMCMV", indRetPmcmv);
   }

   public String getOpcPtrf2023() {
        return this.getVo().asString("OPCPTRF2023");
   }

   public void setOpcPtrf2023(String opcPtrf2023) {
        markAsChanged("OPCPTRF2023", opcPtrf2023);
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
        return this;
   }
}
