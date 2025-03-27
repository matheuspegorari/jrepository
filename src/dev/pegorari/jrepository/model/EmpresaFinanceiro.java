package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaFinanceiro extends AbstractSankhyaEntity<EmpresaFinanceiro> {
   public BigDecimal getCodLancBcoPag() {
        return this.getVo().asBigDecimal("CODLANCBCOPAG");
   }

   public void setCodLancBcoPag(BigDecimal codLancBcoPag) {
        markAsChanged("CODLANCBCOPAG", codLancBcoPag);
   }

   public String getCorTeFaltaWms() {
        return this.getVo().asString("CORTEFALTAWMS");
   }

   public void setCorTeFaltaWms(String corTeFaltaWms) {
        markAsChanged("CORTEFALTAWMS", corTeFaltaWms);
   }

   public String getCpfContador() {
        return this.getVo().asString("CPFCONTADOR");
   }

   public void setCpfContador(String cpfContador) {
        markAsChanged("CPFCONTADOR", cpfContador);
   }

   public String getCrcContador() {
        return this.getVo().asString("CRCCONTADOR");
   }

   public void setCrcContador(String crcContador) {
        markAsChanged("CRCCONTADOR", crcContador);
   }

   public String getCredCofins() {
        return this.getVo().asString("CREDCOFINS");
   }

   public void setCredCofins(String credCofins) {
        markAsChanged("CREDCOFINS", credCofins);
   }

   public String getCredPis() {
        return this.getVo().asString("CREDPIS");
   }

   public void setCredPis(String credPis) {
        markAsChanged("CREDPIS", credPis);
   }

   public BigDecimal getCstIpiEnt() {
        return this.getVo().asBigDecimal("CSTIPIENT");
   }

   public void setCstIpiEnt(BigDecimal cstIpiEnt) {
        markAsChanged("CSTIPIENT", cstIpiEnt);
   }

   public BigDecimal getCstIpiSai() {
        return this.getVo().asBigDecimal("CSTIPISAI");
   }

   public void setCstIpiSai(BigDecimal cstIpiSai) {
        markAsChanged("CSTIPISAI", cstIpiSai);
   }

   public Timestamp getDtCertifNfeFim() {
        return this.getVo().asTimestamp("DTCERTIFNFEFIM");
   }

   public void setDtCertifNfeFim(Timestamp dtCertifNfeFim) {
        markAsChanged("DTCERTIFNFEFIM", dtCertifNfeFim);
   }

   public Timestamp getDtCertifNfeIni() {
        return this.getVo().asTimestamp("DTCERTIFNFEINI");
   }

   public void setDtCertifNfeIni(Timestamp dtCertifNfeIni) {
        markAsChanged("DTCERTIFNFEINI", dtCertifNfeIni);
   }

   public String getEmailContador() {
        return this.getVo().asString("EMAILCONTADOR");
   }

   public void setEmailContador(String emailContador) {
        markAsChanged("EMAILCONTADOR", emailContador);
   }

   public String getEmiteExped() {
        return this.getVo().asString("EMITEEXPED");
   }

   public void setEmiteExped(String emiteExped) {
        markAsChanged("EMITEEXPED", emiteExped);
   }

   public BigDecimal getEmpDestinoWms() {
        return this.getVo().asBigDecimal("EMPDESTINOWMS");
   }

   public void setEmpDestinoWms(BigDecimal empDestinoWms) {
        markAsChanged("EMPDESTINOWMS", empDestinoWms);
   }

   public BigDecimal getEmpSoma() {
        return this.getVo().asBigDecimal("EMPSOMA");
   }

   public void setEmpSoma(BigDecimal empSoma) {
        markAsChanged("EMPSOMA", empSoma);
   }

   public BigDecimal getEndeCktIndef() {
        return this.getVo().asBigDecimal("ENDECKTINDEF");
   }

   public void setEndeCktIndef(BigDecimal endeCktIndef) {
        markAsChanged("ENDECKTINDEF", endeCktIndef);
   }

   public BigDecimal getEndeMovIndef() {
        return this.getVo().asBigDecimal("ENDEMOVINDEF");
   }

   public void setEndeMovIndef(BigDecimal endeMovIndef) {
        markAsChanged("ENDEMOVINDEF", endeMovIndef);
   }

   public String getEntPenBalcaoWms() {
        return this.getVo().asString("ENTPENBALCAOWMS");
   }

   public void setEntPenBalcaoWms(String entPenBalcaoWms) {
        markAsChanged("ENTPENBALCAOWMS", entPenBalcaoWms);
   }

   public String getFlex() {
        return this.getVo().asString("FLEX");
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
   }

   public String getFragmentaEstWms() {
        return this.getVo().asString("FRAGMENTAESTWMS");
   }

   public void setFragmentaEstWms(String fragmentaEstWms) {
        markAsChanged("FRAGMENTAESTWMS", fragmentaEstWms);
   }

   public String getFrasEnfse() {
        return this.getVo().asString("FRASENFSE");
   }

   public void setFrasEnfse(String frasEnfse) {
        markAsChanged("FRASENFSE", frasEnfse);
   }

   public String getFreteSepConstransp() {
        return this.getVo().asString("FRETESEPCONSTRANSP");
   }

   public void setFreteSepConstransp(String freteSepConstransp) {
        markAsChanged("FRETESEPCONSTRANSP", freteSepConstransp);
   }

   public String getFreteSepSemPre() {
        return this.getVo().asString("FRETESEPSEMPRE");
   }

   public void setFreteSepSemPre(String freteSepSemPre) {
        markAsChanged("FRETESEPSEMPRE", freteSepSemPre);
   }

   public String getGeraGnre() {
        return this.getVo().asString("GERAGNRE");
   }

   public void setGeraGnre(String geraGnre) {
        markAsChanged("GERAGNRE", geraGnre);
   }

   public String getGerarLivros() {
        return this.getVo().asString("GERARLIVROS");
   }

   public void setGerarLivros(String gerarLivros) {
        markAsChanged("GERARLIVROS", gerarLivros);
   }

   public String getGerarProdLivEnt() {
        return this.getVo().asString("GERARPRODLIVENT");
   }

   public void setGerarProdLivEnt(String gerarProdLivEnt) {
        markAsChanged("GERARPRODLIVENT", gerarProdLivEnt);
   }

   public String getGerarProdOrigKit() {
        return this.getVo().asString("GERARPRODORIGKIT");
   }

   public void setGerarProdOrigKit(String gerarProdOrigKit) {
        markAsChanged("GERARPRODORIGKIT", gerarProdOrigKit);
   }

   public String getGerNotaEnt() {
        return this.getVo().asString("GERNOTAENT");
   }

   public void setGerNotaEnt(String gerNotaEnt) {
        markAsChanged("GERNOTAENT", gerNotaEnt);
   }

   public String getGravarObsNota() {
        return this.getVo().asString("GRAVAROBSNOTA");
   }

   public void setGravarObsNota(String gravarObsNota) {
        markAsChanged("GRAVAROBSNOTA", gravarObsNota);
   }

   public String getGravarObsPadrao() {
        return this.getVo().asString("GRAVAROBSPADRAO");
   }

   public void setGravarObsPadrao(String gravarObsPadrao) {
        markAsChanged("GRAVAROBSPADRAO", gravarObsPadrao);
   }

   public String getGravarSerieNota() {
        return this.getVo().asString("GRAVARSERIENOTA");
   }

   public void setGravarSerieNota(String gravarSerieNota) {
        markAsChanged("GRAVARSERIENOTA", gravarSerieNota);
   }

   public String getImpEtiqSepOc() {
        return this.getVo().asString("IMPETIQSEPOC");
   }

   public void setImpEtiqSepOc(String impEtiqSepOc) {
        markAsChanged("IMPETIQSEPOC", impEtiqSepOc);
   }

   public String getImpEtiqVolConf() {
        return this.getVo().asString("IMPETIQVOLCONF");
   }

   public void setImpEtiqVolConf(String impEtiqVolConf) {
        markAsChanged("IMPETIQVOLCONF", impEtiqVolConf);
   }

   public BigDecimal getImpEtqVol() {
        return this.getVo().asBigDecimal("IMPETQVOL");
   }

   public void setImpEtqVol(BigDecimal impEtqVol) {
        markAsChanged("IMPETQVOL", impEtqVol);
   }

   public String getImpExped() {
        return this.getVo().asString("IMPEXPED");
   }

   public void setImpExped(String impExped) {
        markAsChanged("IMPEXPED", impExped);
   }

   public String getIncentCult() {
        return this.getVo().asString("INCENTCULT");
   }

   public void setIncentCult(String incentCult) {
        markAsChanged("INCENTCULT", incentCult);
   }

   public BigDecimal getIndEscrit() {
        return this.getVo().asBigDecimal("INDESCRIT");
   }

   public void setIndEscrit(BigDecimal indEscrit) {
        markAsChanged("INDESCRIT", indEscrit);
   }

   public String getIntegraWmsProd() {
        return this.getVo().asString("INTEGRAWMSPROD");
   }

   public void setIntegraWmsProd(String integraWmsProd) {
        markAsChanged("INTEGRAWMSPROD", integraWmsProd);
   }

   public String getIpiIncIcms() {
        return this.getVo().asString("IPIINCICMS");
   }

   public void setIpiIncIcms(String ipiIncIcms) {
        markAsChanged("IPIINCICMS", ipiIncIcms);
   }

   public String getIpiNaoIncid() {
        return this.getVo().asString("IPINAOINCID");
   }

   public void setIpiNaoIncid(String ipiNaoIncid) {
        markAsChanged("IPINAOINCID", ipiNaoIncid);
   }

   public String getLayoutDanfe() {
        return this.getVo().asString("LAYOUTDANFE");
   }

   public void setLayoutDanfe(String layoutDanfe) {
        markAsChanged("LAYOUTDANFE", layoutDanfe);
   }

   public String getLivro1Para1Tgfite() {
        return this.getVo().asString("LIVRO1PARA1TGFITE");
   }

   public void setLivro1Para1Tgfite(String livro1Para1Tgfite) {
        markAsChanged("LIVRO1PARA1TGFITE", livro1Para1Tgfite);
   }

   public BigDecimal getLocalPad() {
        return this.getVo().asBigDecimal("LOCALPAD");
   }

   public void setLocalPad(BigDecimal localPad) {
        markAsChanged("LOCALPAD", localPad);
   }

   public String getLogoDanfe() {
        return this.getVo().asString("LOGODANFE");
   }

   public void setLogoDanfe(String logoDanfe) {
        markAsChanged("LOGODANFE", logoDanfe);
   }

   public String getMarcaNotRps() {
        return this.getVo().asString("MARCANOTRPS");
   }

   public void setMarcaNotRps(String marcaNotRps) {
        markAsChanged("MARCANOTRPS", marcaNotRps);
   }

   public BigDecimal getMaxCredIndeniz() {
        return this.getVo().asBigDecimal("MAXCREDINDENIZ");
   }

   public void setMaxCredIndeniz(BigDecimal maxCredIndeniz) {
        markAsChanged("MAXCREDINDENIZ", maxCredIndeniz);
   }

   public BigDecimal getMaxDebIndeniz() {
        return this.getVo().asBigDecimal("MAXDEBINDENIZ");
   }

   public void setMaxDebIndeniz(BigDecimal maxDebIndeniz) {
        markAsChanged("MAXDEBINDENIZ", maxDebIndeniz);
   }

   public BigDecimal getCodEmpMatrizNfse() {
        return this.getVo().asBigDecimal("CODEMPMATRIZNFSE");
   }

   public void setCodEmpMatrizNfse(BigDecimal codEmpMatrizNfse) {
        markAsChanged("CODEMPMATRIZNFSE", codEmpMatrizNfse);
   }

   public BigDecimal getCodEmpOc() {
        return this.getVo().asBigDecimal("CODEMPOC");
   }

   public void setCodEmpOc(BigDecimal codEmpOc) {
        markAsChanged("CODEMPOC", codEmpOc);
   }

   public BigDecimal getCodEndAvaria() {
        return this.getVo().asBigDecimal("CODENDAVARIA");
   }

   public void setCodEndAvaria(BigDecimal codEndAvaria) {
        markAsChanged("CODENDAVARIA", codEndAvaria);
   }

   public BigDecimal getCodLancBcoRec() {
        return this.getVo().asBigDecimal("CODLANCBCOREC");
   }

   public void setCodLancBcoRec(BigDecimal codLancBcoRec) {
        markAsChanged("CODLANCBCOREC", codLancBcoRec);
   }

   public BigDecimal getCodLocAlterc() {
        return this.getVo().asBigDecimal("CODLOCALTERC");
   }

   public void setCodLocAlterc(BigDecimal codLocAlterc) {
        markAsChanged("CODLOCALTERC", codLocAlterc);
   }

   public BigDecimal getCodModDanfe() {
        return this.getVo().asBigDecimal("CODMODDANFE");
   }

   public void setCodModDanfe(BigDecimal codModDanfe) {
        markAsChanged("CODMODDANFE", codModDanfe);
   }

   public BigDecimal getCodModDanfeContingencia() {
        return this.getVo().asBigDecimal("CODMODDANFECONTINGENCIA");
   }

   public void setCodModDanfeContingencia(BigDecimal codModDanfeContingencia) {
        markAsChanged("CODMODDANFECONTINGENCIA", codModDanfeContingencia);
   }

   public BigDecimal getCodParcCtb() {
        return this.getVo().asBigDecimal("CODPARCCTB");
   }

   public void setCodParcCtb(BigDecimal codParcCtb) {
        markAsChanged("CODPARCCTB", codParcCtb);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTabCalc() {
        return this.getVo().asBigDecimal("CODTABCALC");
   }

   public void setCodTabCalc(BigDecimal codTabCalc) {
        markAsChanged("CODTABCALC", codTabCalc);
   }

   public BigDecimal getCodTipOperaComp() {
        return this.getVo().asBigDecimal("CODTIPOPERACOMP");
   }

   public void setCodTipOperaComp(BigDecimal codTipOperaComp) {
        markAsChanged("CODTIPOPERACOMP", codTipOperaComp);
   }

   public String getCodTrib20Red() {
        return this.getVo().asString("CODTRIB20RED");
   }

   public void setCodTrib20Red(String codTrib20Red) {
        markAsChanged("CODTRIB20RED", codTrib20Red);
   }

   public String getCodTrib30() {
        return this.getVo().asString("CODTRIB30");
   }

   public void setCodTrib30(String codTrib30) {
        markAsChanged("CODTRIB30", codTrib30);
   }

   public String getCodTrib40Isent() {
        return this.getVo().asString("CODTRIB40ISENT");
   }

   public void setCodTrib40Isent(String codTrib40Isent) {
        markAsChanged("CODTRIB40ISENT", codTrib40Isent);
   }

   public String getCodTrib41NaoTrib() {
        return this.getVo().asString("CODTRIB41NAOTRIB");
   }

   public void setCodTrib41NaoTrib(String codTrib41NaoTrib) {
        markAsChanged("CODTRIB41NAOTRIB", codTrib41NaoTrib);
   }

   public String getCodTrib50Susp() {
        return this.getVo().asString("CODTRIB50SUSP");
   }

   public void setCodTrib50Susp(String codTrib50Susp) {
        markAsChanged("CODTRIB50SUSP", codTrib50Susp);
   }

   public String getCodTrib51Dif() {
        return this.getVo().asString("CODTRIB51DIF");
   }

   public void setCodTrib51Dif(String codTrib51Dif) {
        markAsChanged("CODTRIB51DIF", codTrib51Dif);
   }

   public String getCodTrib60StAnt() {
        return this.getVo().asString("CODTRIB60STANT");
   }

   public void setCodTrib60StAnt(String codTrib60StAnt) {
        markAsChanged("CODTRIB60STANT", codTrib60StAnt);
   }

   public String getCodTrib70RedSt() {
        return this.getVo().asString("CODTRIB70REDST");
   }

   public void setCodTrib70RedSt(String codTrib70RedSt) {
        markAsChanged("CODTRIB70REDST", codTrib70RedSt);
   }

   public String getCodTrib90Out() {
        return this.getVo().asString("CODTRIB90OUT");
   }

   public void setCodTrib90Out(String codTrib90Out) {
        markAsChanged("CODTRIB90OUT", codTrib90Out);
   }

   public String getCompIpi() {
        return this.getVo().asString("COMPIPI");
   }

   public void setCompIpi(String compIpi) {
        markAsChanged("COMPIPI", compIpi);
   }

   public String getCompIpiSepIcm() {
        return this.getVo().asString("COMPIPISEPICM");
   }

   public void setCompIpiSepIcm(String compIpiSepIcm) {
        markAsChanged("COMPIPISEPICM", compIpiSepIcm);
   }

   public String getComplItemNota() {
        return this.getVo().asString("COMPLITEMNOTA");
   }

   public void setComplItemNota(String complItemNota) {
        markAsChanged("COMPLITEMNOTA", complItemNota);
   }

   public String getConsEntrPendWms() {
        return this.getVo().asString("CONSENTRPENDWMS");
   }

   public void setConsEntrPendWms(String consEntrPendWms) {
        markAsChanged("CONSENTRPENDWMS", consEntrPendWms);
   }

   public String getConsOutrosImp() {
        return this.getVo().asString("CONSOUTROSIMP");
   }

   public void setConsOutrosImp(String consOutrosImp) {
        markAsChanged("CONSOUTROSIMP", consOutrosImp);
   }

   public String getConsVlrLiqNfse() {
        return this.getVo().asString("CONSVLRLIQNFSE");
   }

   public void setConsVlrLiqNfse(String consVlrLiqNfse) {
        markAsChanged("CONSVLRLIQNFSE", consVlrLiqNfse);
   }

   public String getContingenciaNfe() {
        return this.getVo().asString("CONTINGENCIANFE");
   }

   public void setContingenciaNfe(String contingenciaNfe) {
        markAsChanged("CONTINGENCIANFE", contingenciaNfe);
   }

   public BigDecimal getCopiasDanfe() {
        return this.getVo().asBigDecimal("COPIASDANFE");
   }

   public void setCopiasDanfe(BigDecimal copiasDanfe) {
        markAsChanged("COPIASDANFE", copiasDanfe);
   }

   public BigDecimal getCopiasDanfeConting() {
        return this.getVo().asBigDecimal("COPIASDANFECONTING");
   }

   public void setCopiasDanfeConting(BigDecimal copiasDanfeConting) {
        markAsChanged("COPIASDANFECONTING", copiasDanfeConting);
   }

   public BigDecimal getCodEndDiverg() {
        return this.getVo().asBigDecimal("CODENDDIVERG");
   }

   public void setCodEndDiverg(BigDecimal codEndDiverg) {
        markAsChanged("CODENDDIVERG", codEndDiverg);
   }

   public BigDecimal getCodEndPerda() {
        return this.getVo().asBigDecimal("CODENDPERDA");
   }

   public void setCodEndPerda(BigDecimal codEndPerda) {
        markAsChanged("CODENDPERDA", codEndPerda);
   }

   public BigDecimal getPartIcMeta() {
        return this.getVo().asBigDecimal("PARTICMETA");
   }

   public void setPartIcMeta(BigDecimal partIcMeta) {
        markAsChanged("PARTICMETA", partIcMeta);
   }

   public BigDecimal getPercCfFab() {
        return this.getVo().asBigDecimal("PERCCFFAB");
   }

   public void setPercCfFab(BigDecimal percCfFab) {
        markAsChanged("PERCCFFAB", percCfFab);
   }

   public BigDecimal getPercCfOutros() {
        return this.getVo().asBigDecimal("PERCCFOUTROS");
   }

   public void setPercCfOutros(BigDecimal percCfOutros) {
        markAsChanged("PERCCFOUTROS", percCfOutros);
   }

   public BigDecimal getPercCfServico() {
        return this.getVo().asBigDecimal("PERCCFSERVICO");
   }

   public void setPercCfServico(BigDecimal percCfServico) {
        markAsChanged("PERCCFSERVICO", percCfServico);
   }

   public BigDecimal getPercCofins() {
        return this.getVo().asBigDecimal("PERCCOFINS");
   }

   public void setPercCofins(BigDecimal percCofins) {
        markAsChanged("PERCCOFINS", percCofins);
   }

   public BigDecimal getPercCsl() {
        return this.getVo().asBigDecimal("PERCCSL");
   }

   public void setPercCsl(BigDecimal percCsl) {
        markAsChanged("PERCCSL", percCsl);
   }

   public BigDecimal getPercCusVar() {
        return this.getVo().asBigDecimal("PERCCUSVAR");
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
   }

   public BigDecimal getPercMargem() {
        return this.getVo().asBigDecimal("PERCMARGEM");
   }

   public void setPercMargem(BigDecimal percMargem) {
        markAsChanged("PERCMARGEM", percMargem);
   }

   public BigDecimal getPercPis() {
        return this.getVo().asBigDecimal("PERCPIS");
   }

   public void setPercPis(BigDecimal percPis) {
        markAsChanged("PERCPIS", percPis);
   }

   public String getPerfilEfd() {
        return this.getVo().asString("PERFILEFD");
   }

   public void setPerfilEfd(String perfilEfd) {
        markAsChanged("PERFILEFD", perfilEfd);
   }

   public String getPercProj() {
        return this.getVo().asString("PERPROJ");
   }

   public void setPercProj(String percProj) {
        markAsChanged("PERPROJ", percProj);
   }

   public String getProdEpe() {
        return this.getVo().asString("PRODEPE");
   }

   public void setProdEpe(String prodEpe) {
        markAsChanged("PRODEPE", prodEpe);
   }

   public String getProjOnline() {
        return this.getVo().asString("PROJONLINE");
   }

   public void setProjOnline(String projOnline) {
        markAsChanged("PROJONLINE", projOnline);
   }

   public String getRastrEstoque() {
        return this.getVo().asString("RASTRESTOQUE");
   }

   public void setRastrEstoque(String rastrEstoque) {
        markAsChanged("RASTRESTOQUE", rastrEstoque);
   }

   public String getReabCorrecaoWms() {
        return this.getVo().asString("REABCORRECAOWMS");
   }

   public void setReabCorrecaoWms(String reabCorrecaoWms) {
        markAsChanged("REABCORRECAOWMS", reabCorrecaoWms);
   }

   public String getRecMinTare() {
        return this.getVo().asString("RECMINTARE");
   }

   public void setRecMinTare(String recMinTare) {
        markAsChanged("RECMINTARE", recMinTare);
   }

   public String getReg54Seq997St() {
        return this.getVo().asString("REG54SEQ997ST");
   }

   public void setReg54Seq997St(String reg54Seq997St) {
        markAsChanged("REG54SEQ997ST", reg54Seq997St);
   }

   public String getRegimeEspTribIss() {
        return this.getVo().asString("REGIMEESPTRIBISS");
   }

   public void setRegimeEspTribIss(String regimeEspTribIss) {
        markAsChanged("REGIMEESPTRIBISS", regimeEspTribIss);
   }

   public String getSaldoLivQuinz() {
        return this.getVo().asString("SALDOLIVQUINZ");
   }

   public void setSaldoLivQuinz(String saldoLivQuinz) {
        markAsChanged("SALDOLIVQUINZ", saldoLivQuinz);
   }

   public String getCodTrib61() {
        return this.getVo().asString("CODTRIB61");
   }

   public void setCodTrib61(String codTrib61) {
        markAsChanged("CODTRIB61", codTrib61);
   }

   public String getPrefixSerieNacional() {
        return this.getVo().asString("PREFIXSERIENACIONAL");
   }

   public void setPrefixSerieNacional(String prefixSerieNacional) {
        markAsChanged("PREFIXSERIENACIONAL", prefixSerieNacional);
   }

   public String getSaldoLivQuinzIpi() {
        return this.getVo().asString("SALDOLIVQUINZIPI");
   }

   public void setSaldoLivQuinzIpi(String saldoLivQuinzIpi) {
        markAsChanged("SALDOLIVQUINZIPI", saldoLivQuinzIpi);
   }

   public String getSenhaNfse() {
        return this.getVo().asString("SENHANFSE");
   }

   public void setSenhaNfse(String senhaNfse) {
        markAsChanged("SENHANFSE", senhaNfse);
   }

   public String getSerieAcompCf() {
        return this.getVo().asString("SERIEACOMPCF");
   }

   public void setSerieAcompCf(String serieAcompCf) {
        markAsChanged("SERIEACOMPCF", serieAcompCf);
   }

   public String getSerieDevWms() {
        return this.getVo().asString("SERIEDEVWMS");
   }

   public void setSerieDevWms(String serieDevWms) {
        markAsChanged("SERIEDEVWMS", serieDevWms);
   }

   public String getStInclusa() {
        return this.getVo().asString("STINCLUSA");
   }

   public void setStInclusa(String stInclusa) {
        markAsChanged("STINCLUSA", stInclusa);
   }

   public String getTelContador() {
        return this.getVo().asString("TELCONTADOR");
   }

   public void setTelContador(String telContador) {
        markAsChanged("TELCONTADOR", telContador);
   }

   public String getTemCofins() {
        return this.getVo().asString("TEMCOFINS");
   }

   public void setTemCofins(String temCofins) {
        markAsChanged("TEMCOFINS", temCofins);
   }

   public String getTemCssl() {
        return this.getVo().asString("TEMCSSL");
   }

   public void setTemCssl(String temCssl) {
        markAsChanged("TEMCSSL", temCssl);
   }

   public String getTemPis() {
        return this.getVo().asString("TEMPIS");
   }

   public void setTemPis(String temPis) {
        markAsChanged("TEMPIS", temPis);
   }

   public String getTemReaIcms() {
        return this.getVo().asString("TEMREAICMS");
   }

   public void setTemReaIcms(String temReaIcms) {
        markAsChanged("TEMREAICMS", temReaIcms);
   }

   public BigDecimal getTipoAtividade() {
        return this.getVo().asBigDecimal("TIPOATIVIDADE");
   }

   public void setTipoAtividade(BigDecimal tipoAtividade) {
        markAsChanged("TIPOATIVIDADE", tipoAtividade);
   }

   public BigDecimal getTipoAtividadePisCofins() {
        return this.getVo().asBigDecimal("TIPOATIVIDADEPISCOFINS");
   }

   public void setTipoAtividadePisCofins(BigDecimal tipoAtividadePisCofins) {
        markAsChanged("TIPOATIVIDADEPISCOFINS", tipoAtividadePisCofins);
   }

   public String getTipoCorteWms() {
        return this.getVo().asString("TIPOCORTEWMS");
   }

   public void setTipoCorteWms(String tipoCorteWms) {
        markAsChanged("TIPOCORTEWMS", tipoCorteWms);
   }

   public String getTipoDanfe() {
        return this.getVo().asString("TIPODANFE");
   }

   public void setTipoDanfe(String tipoDanfe) {
        markAsChanged("TIPODANFE", tipoDanfe);
   }

   public String getTipoEnvioNfe() {
        return this.getVo().asString("TIPOENVIONFE");
   }

   public void setTipoEnvioNfe(String tipoEnvioNfe) {
        markAsChanged("TIPOENVIONFE", tipoEnvioNfe);
   }

   public String getTipoImpressora() {
        return this.getVo().asString("TIPOIMPRESSORA");
   }

   public void setTipoImpressora(String tipoImpressora) {
        markAsChanged("TIPOIMPRESSORA", tipoImpressora);
   }

   public String getTiraServLrContab() {
        return this.getVo().asString("TIRASERVLRCONTAB");
   }

   public void setTiraServLrContab(String tiraServLrContab) {
        markAsChanged("TIRASERVLRCONTAB", tiraServLrContab);
   }

   public BigDecimal getTopDevolucaoWms() {
        return this.getVo().asBigDecimal("TOPDEVOLUCAOWMS");
   }

   public void setTopDevolucaoWms(BigDecimal topDevolucaoWms) {
        markAsChanged("TOPDEVOLUCAOWMS", topDevolucaoWms);
   }

   public BigDecimal getTopEntradaWms() {
        return this.getVo().asBigDecimal("TOPENTRADAWMS");
   }

   public void setTopEntradaWms(BigDecimal topEntradaWms) {
        markAsChanged("TOPENTRADAWMS", topEntradaWms);
   }

   public BigDecimal getTopEnvWmsAgrup() {
        return this.getVo().asBigDecimal("TOPENVWMSAGRUP");
   }

   public void setTopEnvWmsAgrup(BigDecimal topEnvWmsAgrup) {
        markAsChanged("TOPENVWMSAGRUP", topEnvWmsAgrup);
   }

   public BigDecimal getTpAssinante() {
        return this.getVo().asBigDecimal("TPASSINANTE");
   }

   public void setTpAssinante(BigDecimal tpAssinante) {
        markAsChanged("TPASSINANTE", tpAssinante);
   }

   public String getTpAssinanteInf() {
        return this.getVo().asString("TPASSINANTEINF");
   }

   public void setTpAssinanteInf(String tpAssinanteInf) {
        markAsChanged("TPASSINANTEINF", tpAssinanteInf);
   }

   public BigDecimal getTpLigacao() {
        return this.getVo().asBigDecimal("TPLIGACAO");
   }

   public void setTpLigacao(BigDecimal tpLigacao) {
        markAsChanged("TPLIGACAO", tpLigacao);
   }

   public String getTpLigacaoInf() {
        return this.getVo().asString("TPLIGACAOINF");
   }

   public void setTpLigacaoInf(String tpLigacaoInf) {
        markAsChanged("TPLIGACAOINF", tpLigacaoInf);
   }

   public String getTrabComIpi() {
        return this.getVo().asString("TRABCOMIPI");
   }

   public void setTrabComIpi(String trabComIpi) {
        markAsChanged("TRABCOMIPI", trabComIpi);
   }

   public String getTratarDifParc() {
        return this.getVo().asString("TRATARDIFPARC");
   }

   public void setTratarDifParc(String tratarDifParc) {
        markAsChanged("TRATARDIFPARC", tratarDifParc);
   }

   public String getTratarTribut() {
        return this.getVo().asString("TRATARTRIBUT");
   }

   public void setTratarTribut(String tratarTribut) {
        markAsChanged("TRATARTRIBUT", tratarTribut);
   }

   public String getTratarTributDefEmp() {
        return this.getVo().asString("TRATARTRIBUTDEFEMP");
   }

   public void setTratarTributDefEmp(String tratarTributDefEmp) {
        markAsChanged("TRATARTRIBUTDEFEMP", tratarTributDefEmp);
   }

   public String getTratoCWms() {
        return this.getVo().asString("TRATOCWMS");
   }

   public void setTratoCWms(String tratoCWms) {
        markAsChanged("TRATOCWMS", tratoCWms);
   }

   public String getUfCrContador() {
        return this.getVo().asString("UFCRCCONTADOR");
   }

   public void setUfCrContador(String ufCrContador) {
        markAsChanged("UFCRCCONTADOR", ufCrContador);
   }

   public BigDecimal getUltAutorPag() {
        return this.getVo().asBigDecimal("ULTAUTORPAG");
   }

   public void setUltAutorPag(BigDecimal ultAutorPag) {
        markAsChanged("ULTAUTORPAG", ultAutorPag);
   }

   public BigDecimal getUltDupl() {
        return this.getVo().asBigDecimal("ULTDUPL");
   }

   public void setUltDupl(BigDecimal ultDupl) {
        markAsChanged("ULTDUPL", ultDupl);
   }

   public BigDecimal getUltPagCiapModc() {
        return this.getVo().asBigDecimal("ULTPAGCIAPMODC");
   }

   public void setUltPagCiapModc(BigDecimal ultPagCiapModc) {
        markAsChanged("ULTPAGCIAPMODC", ultPagCiapModc);
   }

   public BigDecimal getUltPagLivEntrad() {
        return this.getVo().asBigDecimal("ULTPAGLIVENTRAD");
   }

   public void setUltPagLivEntrad(BigDecimal ultPagLivEntrad) {
        markAsChanged("ULTPAGLIVENTRAD", ultPagLivEntrad);
   }

   public BigDecimal getUltPagLivIcms() {
        return this.getVo().asBigDecimal("ULTPAGLIVICMS");
   }

   public void setUltPagLivIcms(BigDecimal ultPagLivIcms) {
        markAsChanged("ULTPAGLIVICMS", ultPagLivIcms);
   }

   public BigDecimal getUltPagLivIpi() {
        return this.getVo().asBigDecimal("ULTPAGLIVIPI");
   }

   public void setUltPagLivIpi(BigDecimal ultPagLivIpi) {
        markAsChanged("ULTPAGLIVIPI", ultPagLivIpi);
   }

   public BigDecimal getUltPagLivIss() {
        return this.getVo().asBigDecimal("ULTPAGLIVISS");
   }

   public void setUltPagLivIss(BigDecimal ultPagLivIss) {
        markAsChanged("ULTPAGLIVISS", ultPagLivIss);
   }

   public BigDecimal getUltPagLivSaida() {
        return this.getVo().asBigDecimal("ULTPAGLIVSAIDA");
   }

   public void setUltPagLivSaida(BigDecimal ultPagLivSaida) {
        markAsChanged("ULTPAGLIVSAIDA", ultPagLivSaida);
   }

   public String getUsaMovVertWms() {
        return this.getVo().asString("USAMOVVERTWMS");
   }

   public void setUsaMovVertWms(String usaMovVertWms) {
        markAsChanged("USAMOVVERTWMS", usaMovVertWms);
   }

   public String getUsaTributItens() {
        return this.getVo().asString("USATRIBUTITENS");
   }

   public void setUsaTributItens(String usaTributItens) {
        markAsChanged("USATRIBUTITENS", usaTributItens);
   }

   public String getUsuarioNfse() {
        return this.getVo().asString("USUARIONFSE");
   }

   public void setUsuarioNfse(String usuarioNfse) {
        markAsChanged("USUARIONFSE", usuarioNfse);
   }

   public String getUtilizaWms() {
        return this.getVo().asString("UTILIZAWMS");
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
   }

   public BigDecimal getVersaoNfe() {
        return this.getVo().asBigDecimal("VERSAONFE");
   }

   public void setVersaoNfe(BigDecimal versaoNfe) {
        markAsChanged("VERSAONFE", versaoNfe);
   }

   public String getVlrLiqItemNfe() {
        return this.getVo().asString("VLRLIQITEMNFE");
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
   }

   public BigDecimal getWmsCodEndGar() {
        return this.getVo().asBigDecimal("WMSCODENDGAR");
   }

   public void setWmsCodEndGar(BigDecimal wmsCodEndGar) {
        markAsChanged("WMSCODENDGAR", wmsCodEndGar);
   }

   public BigDecimal getWmsLocalAjEst() {
        return this.getVo().asBigDecimal("WMSLOCALAJEST");
   }

   public void setWmsLocalAjEst(BigDecimal wmsLocalAjEst) {
        markAsChanged("WMSLOCALAJEST", wmsLocalAjEst);
   }

   public String getWmsUsaRegVolFat() {
        return this.getVo().asString("WMSUSAREGVOLFAT");
   }

   public void setWmsUsaRegVolFat(String wmsUsaRegVolFat) {
        markAsChanged("WMSUSAREGVOLFAT", wmsUsaRegVolFat);
   }

   public Timestamp getDtInicioKardex() {
        return this.getVo().asTimestamp("DTINICIOKARDEX");
   }

   public void setDtInicioKardex(Timestamp dtInicioKardex) {
        markAsChanged("DTINICIOKARDEX", dtInicioKardex);
   }

   public String getGerLdPerTri() {
        return this.getVo().asString("GERLDPERTRI");
   }

   public void setGerLdPerTri(String gerLdPerTri) {
        markAsChanged("GERLDPERTRI", gerLdPerTri);
   }

   public String getIcmsScttd() {
        return this.getVo().asString("ICMSSCTTD");
   }

   public void setIcmsScttd(String icmsScttd) {
        markAsChanged("ICMSSCTTD", icmsScttd);
   }

   public BigDecimal getMaxNotasLoteNfe() {
        return this.getVo().asBigDecimal("MAXNOTASLOTENFE");
   }

   public void setMaxNotasLoteNfe(BigDecimal maxNotasLoteNfe) {
        markAsChanged("MAXNOTASLOTENFE", maxNotasLoteNfe);
   }

   public BigDecimal getModDupl() {
        return this.getVo().asBigDecimal("MODDUPL");
   }

   public void setModDupl(BigDecimal modDupl) {
        markAsChanged("MODDUPL", modDupl);
   }

   public BigDecimal getModExped() {
        return this.getVo().asBigDecimal("MODEXPED");
   }

   public void setModExped(BigDecimal modExped) {
        markAsChanged("MODEXPED", modExped);
   }

   public String getNatPessoaJuridica() {
        return this.getVo().asString("NATPESSOAJURIDICA");
   }

   public void setNatPessoaJuridica(String natPessoaJuridica) {
        markAsChanged("NATPESSOAJURIDICA", natPessoaJuridica);
   }

   public String getNfe() {
        return this.getVo().asString("NFE");
   }

   public void setNfe(String nfe) {
        markAsChanged("NFE", nfe);
   }

   public String getNfse() {
        return this.getVo().asString("NFSE");
   }

   public void setNfse(String nfse) {
        markAsChanged("NFSE", nfse);
   }

   public String getNomeContador() {
        return this.getVo().asString("NOMECONTADOR");
   }

   public void setNomeContador(String nomeContador) {
        markAsChanged("NOMECONTADOR", nomeContador);
   }

   public String getCcm() {
        return this.getVo().asString("CCM");
   }

   public void setCcm(String ccm) {
        markAsChanged("CCM", ccm);
   }

   public String getAgrupaServFat() {
        return this.getVo().asString("AGRUPASERVFAT");
   }

   public void setAgrupaServFat(String agrupaServFat) {
        markAsChanged("AGRUPASERVFAT", agrupaServFat);
   }

   public String getAltContador() {
        return this.getVo().asString("ALTCONTADOR");
   }

   public void setAltContador(String altContador) {
        markAsChanged("ALTCONTADOR", altContador);
   }

   public String getArqModBoleto() {
        return this.getVo().asString("ARQMODBOLETO");
   }

   public void setArqModBoleto(String arqModBoleto) {
        markAsChanged("ARQMODBOLETO", arqModBoleto);
   }

   public BigDecimal getNotaSaiPerdaWms() {
        return this.getVo().asBigDecimal("NOTASAIPERDAWMS");
   }

   public void setNotaSaiPerdaWms(BigDecimal notaSaiPerdaWms) {
        markAsChanged("NOTASAIPERDAWMS", notaSaiPerdaWms);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public BigDecimal getNuRfeCartaCorr() {
        return this.getVo().asBigDecimal("NURFECARTACORR");
   }

   public void setNuRfeCartaCorr(BigDecimal nuRfeCartaCorr) {
        markAsChanged("NURFECARTACORR", nuRfeCartaCorr);
   }

   public String getCalcIss() {
        return this.getVo().asString("CALCISS");
   }

   public void setCalcIss(String calcIss) {
        markAsChanged("CALCISS", calcIss);
   }

   public BigDecimal getCalcPercPis() {
        return this.getVo().asBigDecimal("CALPERCPIS");
   }

   public void setCalcPercPis(BigDecimal calcPercPis) {
        markAsChanged("CALPERCPIS", calcPercPis);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodCenCusDesp() {
        return this.getVo().asBigDecimal("CODCENCUSDESP");
   }

   public void setCodCenCusDesp(BigDecimal codCenCusDesp) {
        markAsChanged("CODCENCUSDESP", codCenCusDesp);
   }

   public BigDecimal getCodCtabCoIpad() {
        return this.getVo().asBigDecimal("CODCTABCOIPAD");
   }

   public void setCodCtabCoIpad(BigDecimal codCtabCoIpad) {
        markAsChanged("CODCTABCOIPAD", codCtabCoIpad);
   }

   public BigDecimal getCodCtActb1() {
        return this.getVo().asBigDecimal("CODCTACTB_1");
   }

   public void setCodCtActb1(BigDecimal codCtActb1) {
        markAsChanged("CODCTACTB_1", codCtActb1);
   }

   public BigDecimal getCodCtActb2() {
        return this.getVo().asBigDecimal("CODCTACTB_2");
   }

   public void setCodCtActb2(BigDecimal codCtActb2) {
        markAsChanged("CODCTACTB_2", codCtActb2);
   }

   public BigDecimal getCodCtActb3() {
        return this.getVo().asBigDecimal("CODCTACTB_3");
   }

   public void setCodCtActb3(BigDecimal codCtActb3) {
        markAsChanged("CODCTACTB_3", codCtActb3);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpMatrizEfd() {
        return this.getVo().asBigDecimal("CODEMPMATRIZEFD");
   }

   public void setCodEmpMatrizEfd(BigDecimal codEmpMatrizEfd) {
        markAsChanged("CODEMPMATRIZEFD", codEmpMatrizEfd);
   }

   public BigDecimal getCodEndSobra() {
        return this.getVo().asBigDecimal("CODENDSOBRA");
   }

   public void setCodEndSobra(BigDecimal codEndSobra) {
        markAsChanged("CODENDSOBRA", codEndSobra);
   }

   public BigDecimal getCodEndWms() {
        return this.getVo().asBigDecimal("CODENDWMS");
   }

   public void setCodEndWms(BigDecimal codEndWms) {
        markAsChanged("CODENDWMS", codEndWms);
   }

   public BigDecimal getCodFormPrec() {
        return this.getVo().asBigDecimal("CODFORMPREC");
   }

   public void setCodFormPrec(BigDecimal codFormPrec) {
        markAsChanged("CODFORMPREC", codFormPrec);
   }

   public String getCodGrupoTensao() {
        return this.getVo().asString("CODGRUPOTENSAO");
   }

   public void setCodGrupoTensao(String codGrupoTensao) {
        markAsChanged("CODGRUPOTENSAO", codGrupoTensao);
   }

   public BigDecimal getNotaSaiAjustEst() {
        return this.getVo().asBigDecimal("NOTASAIAJUSTEST");
   }

   public void setNotaSaiAjustEst(BigDecimal notaSaiAjustEst) {
        markAsChanged("NOTASAIAJUSTEST", notaSaiAjustEst);
   }

   public String getUtilizaMde() {
        return this.getVo().asString("UTILIZAMDE");
   }

   public void setUtilizaMde(String utilizaMde) {
        markAsChanged("UTILIZAMDE", utilizaMde);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCalcFunRural() {
        return this.getVo().asString("CALCFUNRURAL");
   }

   public void setCalcFunRural(String calcFunRural) {
        markAsChanged("CALCFUNRURAL", calcFunRural);
   }

   public String getCalcIcms() {
        return this.getVo().asString("CALCICMS");
   }

   public void setCalcIcms(String calcIcms) {
        markAsChanged("CALCICMS", calcIcms);
   }

   public String getCalcIrrf() {
        return this.getVo().asString("CALCIRRF");
   }

   public void setCalcIrrf(String calcIrrf) {
        markAsChanged("CALCIRRF", calcIrrf);
   }

   public BigDecimal getNotaEntAjustEst() {
        return this.getVo().asBigDecimal("NOTAENTAJUSTEST");
   }

   public void setNotaEntAjustEst(BigDecimal notaEntAjustEst) {
        markAsChanged("NOTAENTAJUSTEST", notaEntAjustEst);
   }

   public BigDecimal getNotaEntSobraWms() {
        return this.getVo().asBigDecimal("NOTAENTSOBRAWMS");
   }

   public void setNotaEntSobraWms(BigDecimal notaEntSobraWms) {
        markAsChanged("NOTAENTSOBRAWMS", notaEntSobraWms);
   }

   public String getCodTrib53() {
        return this.getVo().asString("CODTRIB53");
   }

   public void setCodTrib53(String codTrib53) {
        markAsChanged("CODTRIB53", codTrib53);
   }

   public String getEnvRespContNfe() {
        return this.getVo().asString("ENVRESPCONTNFE");
   }

   public void setEnvRespContNfe(String envRespContNfe) {
        markAsChanged("ENVRESPCONTNFE", envRespContNfe);
   }

   public BigDecimal getTpObsFinG4000() {
        return this.getVo().asBigDecimal("TPOBSFING4000");
   }

   public void setTpObsFinG4000(BigDecimal tpObsFinG4000) {
        markAsChanged("TPOBSFING4000", tpObsFinG4000);
   }

   public BigDecimal getTpObsNotaG4000() {
        return this.getVo().asBigDecimal("TPOBSNOTAG4000");
   }

   public void setTpObsNotaG4000(BigDecimal tpObsNotaG4000) {
        markAsChanged("TPOBSNOTAG4000", tpObsNotaG4000);
   }

   public String getGerObsFinG4000() {
        return this.getVo().asString("GEROBSFING4000");
   }

   public void setGerObsFinG4000(String gerObsFinG4000) {
        markAsChanged("GEROBSFING4000", gerObsFinG4000);
   }

   public BigDecimal getCodBcoIpi() {
        return this.getVo().asBigDecimal("CODBCOIPI");
   }

   public void setCodBcoIpi(BigDecimal codBcoIpi) {
        markAsChanged("CODBCOIPI", codBcoIpi);
   }

   public String getTipTransmNfse() {
        return this.getVo().asString("TIPTRANSMNFSE");
   }

   public void setTipTransmNfse(String tipTransmNfse) {
        markAsChanged("TIPTRANSMNFSE", tipTransmNfse);
   }

   public BigDecimal getCodParcNfce() {
        return this.getVo().asBigDecimal("CODPARCNFCE");
   }

   public void setCodParcNfce(BigDecimal codParcNfce) {
        markAsChanged("CODPARCNFCE", codParcNfce);
   }

   public String getIncentFiscalIssqn() {
        return this.getVo().asString("INCENTFISCALISSQN");
   }

   public void setIncentFiscalIssqn(String incentFiscalIssqn) {
        markAsChanged("INCENTFISCALISSQN", incentFiscalIssqn);
   }

   public String getSerieTopDifMenor() {
        return this.getVo().asString("SERIETOPDIFMENOR");
   }

   public void setSerieTopDifMenor(String serieTopDifMenor) {
        markAsChanged("SERIETOPDIFMENOR", serieTopDifMenor);
   }

   public String getSerieTopDifMaior() {
        return this.getVo().asString("SERIETOPDIFMAIOR");
   }

   public void setSerieTopDifMaior(String serieTopDifMaior) {
        markAsChanged("SERIETOPDIFMAIOR", serieTopDifMaior);
   }

   public String getTipIcmsTopEntSimNac() {
        return this.getVo().asString("TIPICMSTOPENTSIMNAC");
   }

   public void setTipIcmsTopEntSimNac(String tipIcmsTopEntSimNac) {
        markAsChanged("TIPICMSTOPENTSIMNAC", tipIcmsTopEntSimNac);
   }

   public BigDecimal getCodEnqIpiEnt() {
        return this.getVo().asBigDecimal("CODENQIPIENT");
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpiEnt);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodModNfceCompl() {
        return this.getVo().asBigDecimal("CODMODNFCECOMPL");
   }

   public void setCodModNfceCompl(BigDecimal codModNfceCompl) {
        markAsChanged("CODMODNFCECOMPL", codModNfceCompl);
   }

   public BigDecimal getCodModNfceSimpl() {
        return this.getVo().asBigDecimal("CODMODNFCESIMPL");
   }

   public void setCodModNfceSimpl(BigDecimal codModNfceSimpl) {
        markAsChanged("CODMODNFCESIMPL", codModNfceSimpl);
   }

   public BigDecimal getCodenqipisai() {
        return this.getVo().asBigDecimal("CODENQIPISAI");
   }

   public void setCodenqipisai(BigDecimal codenqipisai) {
        markAsChanged("CODENQIPISAI", codenqipisai);
   }

   public BigDecimal getTopsaidadifpesowms() {
        return this.getVo().asBigDecimal("TOPSAIDADIFPESOWMS");
   }

   public void setTopsaidadifpesowms(BigDecimal topsaidadifpesowms) {
        markAsChanged("TOPSAIDADIFPESOWMS", topsaidadifpesowms);
   }

   public BigDecimal getCodtabalt() {
        return this.getVo().asBigDecimal("CODTABALT");
   }

   public void setCodtabalt(BigDecimal codtabalt) {
        markAsChanged("CODTABALT", codtabalt);
   }

   public BigDecimal getCodsmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodsmtp(BigDecimal codsmtp) {
        markAsChanged("CODSMTP", codsmtp);
   }

   public BigDecimal getTopentdifpesowms() {
        return this.getVo().asBigDecimal("TOPENTDIFPESOWMS");
   }

   public void setTopentdifpesowms(BigDecimal topentdifpesowms) {
        markAsChanged("TOPENTDIFPESOWMS", topentdifpesowms);
   }

   public BigDecimal getCodtipparc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodtipparc(BigDecimal codtipparc) {
        markAsChanged("CODTIPPARC", codtipparc);
   }

   public BigDecimal getCoragendado() {
        return this.getVo().asBigDecimal("CORAGENDADO");
   }

   public void setCoragendado(BigDecimal coragendado) {
        markAsChanged("CORAGENDADO", coragendado);
   }

   public BigDecimal getCoratendido() {
        return this.getVo().asBigDecimal("CORATENDIDO");
   }

   public void setCoratendido(BigDecimal coratendido) {
        markAsChanged("CORATENDIDO", coratendido);
   }

   public BigDecimal getCorbloqueado() {
        return this.getVo().asBigDecimal("CORBLOQUEADO");
   }

   public void setCorbloqueado(BigDecimal corbloqueado) {
        markAsChanged("CORBLOQUEADO", corbloqueado);
   }

   public BigDecimal getCorencaixado() {
        return this.getVo().asBigDecimal("CORENCAIXADO");
   }

   public void setCorencaixado(BigDecimal corencaixado) {
        markAsChanged("CORENCAIXADO", corencaixado);
   }

   public BigDecimal getCorfaturado() {
        return this.getVo().asBigDecimal("CORFATURADO");
   }

   public void setCorfaturado(BigDecimal corfaturado) {
        markAsChanged("CORFATURADO", corfaturado);
   }

   public BigDecimal getCorfixado() {
        return this.getVo().asBigDecimal("CORFIXADO");
   }

   public void setCorfixado(BigDecimal corfixado) {
        markAsChanged("CORFIXADO", corfixado);
   }

   public BigDecimal getHorafinal() {
        return this.getVo().asBigDecimal("HORAFINAL");
   }

   public void setHorafinal(BigDecimal horafinal) {
        markAsChanged("HORAFINAL", horafinal);
   }

   public BigDecimal getHorainicial() {
        return this.getVo().asBigDecimal("HORAINICIAL");
   }

   public void setHorainicial(BigDecimal horainicial) {
        markAsChanged("HORAINICIAL", horainicial);
   }

   public BigDecimal getIntervalo() {
        return this.getVo().asBigDecimal("INTERVALO");
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
   }

   public BigDecimal getNotamodelodagenda() {
        return this.getVo().asBigDecimal("NOTAMODELODAGENDA");
   }

   public void setNotamodelodagenda(BigDecimal notamodelodagenda) {
        markAsChanged("NOTAMODELODAGENDA", notamodelodagenda);
   }

   public BigDecimal getQtdlimitemes() {
        return this.getVo().asBigDecimal("QTDLIMITEMES");
   }

   public void setQtdlimitemes(BigDecimal qtdlimitemes) {
        markAsChanged("QTDLIMITEMES", qtdlimitemes);
   }

   public String getValidacpfcnpj() {
        return this.getVo().asString("VALIDACPFCNPJ");
   }

   public void setValidacpfcnpj(String validacpfcnpj) {
        markAsChanged("VALIDACPFCNPJ", validacpfcnpj);
   }

   public String getWmsusaeqipal() {
        return this.getVo().asString("WMSUSAETIQPAL");
   }

   public void setWmsusaeqipal(String wmsusaeqipal) {
        markAsChanged("WMSUSAETIQPAL", wmsusaeqipal);
   }

   public String getGerobsnotag4000() {
        return this.getVo().asString("GEROBSNOTAG4000");
   }

   public void setGerobsnotag4000(String gerobsnotag4000) {
        markAsChanged("GEROBSNOTAG4000", gerobsnotag4000);
   }

   public BigDecimal getMargsegpcp() {
        return this.getVo().asBigDecimal("MARGSEGPCP");
   }

   public void setMargsegpcp(BigDecimal margsegpcp) {
        markAsChanged("MARGSEGPCP", margsegpcp);
   }

   public BigDecimal getSeqtokennfce() {
        return this.getVo().asBigDecimal("SEQTOKENNFCE");
   }

   public void setSeqtokennfce(BigDecimal seqtokennfce) {
        markAsChanged("SEQTOKENNFCE", seqtokennfce);
   }

   public String getTokennfce() {
        return this.getVo().asString("TOKENNFCE");
   }

   public void setTokennfce(String tokennfce) {
        markAsChanged("TOKENNFCE", tokennfce);
   }

   public String getTpambmdfe() {
        return this.getVo().asString("TPAMBMDFE");
   }

   public void setTpambmdfe(String tpambmdfe) {
        markAsChanged("TPAMBMDFE", tpambmdfe);
   }

   public String getVlrliqitemnfce() {
        return this.getVo().asString("VLRLIQITEMNFCE");
   }

   public void setVlrliqitemnfce(String vlrliqitemnfce) {
        markAsChanged("VLRLIQITEMNFCE", vlrliqitemnfce);
   }

   public String getChavedigitalagiliblue() {
        return this.getVo().asString("CHAVEDIGITALAGILIBLUE");
   }

   public void setChavedigitalagiliblue(String chavedigitalagiliblue) {
        markAsChanged("CHAVEDIGITALAGILIBLUE", chavedigitalagiliblue);
   }

   public String getCodusunfse() {
        return this.getVo().asString("CODUSUNFSE");
   }

   public void setCodusunfse(String codusunfse) {
        markAsChanged("CODUSUNFSE", codusunfse);
   }

   public String getCodcontrinfse() {
        return this.getVo().asString("CODCONTRINFSE");
   }

   public void setCodcontrinfse(String codcontrinfse) {
        markAsChanged("CODCONTRINFSE", codcontrinfse);
   }

   public String getTemdenuespont() {
        return this.getVo().asString("TEMDENUESPONT");
   }

   public void setTemdenuespont(String temdenuespont) {
        markAsChanged("TEMDENUESPONT", temdenuespont);
   }

   public BigDecimal getPrztolcannota() {
        return this.getVo().asBigDecimal("PRZTOLCANNOTA");
   }

   public void setPrztolcannota(BigDecimal prztolcannota) {
        markAsChanged("PRZTOLCANNOTA", prztolcannota);
   }

   public BigDecimal getPrzregcannota() {
        return this.getVo().asBigDecimal("PRZREGCANNOTA");
   }

   public void setPrzregcannota(BigDecimal przregcannota) {
        markAsChanged("PRZREGCANNOTA", przregcannota);
   }

   public String getSernatribbaseiss() {
        return this.getVo().asString("SERNAOTRIBBASEISS");
   }

   public void setSernatribbaseiss(String sernatribbaseiss) {
        markAsChanged("SERNAOTRIBBASEISS", sernatribbaseiss);
   }

   public BigDecimal getCodendarmindef() {
        return this.getVo().asBigDecimal("CODENDARMINDEF");
   }

   public void setCodendarmindef(BigDecimal codendarmindef) {
        markAsChanged("CODENDARMINDEF", codendarmindef);
   }

   public BigDecimal getCopiasdacte() {
        return this.getVo().asBigDecimal("COPIASDACTE");
   }

   public void setCopiasdacte(BigDecimal copiasdacte) {
        markAsChanged("COPIASDACTE", copiasdacte);
   }

   public String getTpambcte() {
        return this.getVo().asString("TPAMBCTE");
   }

   public void setTpambcte(String tpambcte) {
        markAsChanged("TPAMBCTE", tpambcte);
   }

   public BigDecimal getCodmoddacte() {
        return this.getVo().asBigDecimal("CODMODDACTE");
   }

   public void setCodmoddacte(BigDecimal codmoddacte) {
        markAsChanged("CODMODDACTE", codmoddacte);
   }

   public String getTipoenviocte() {
        return this.getVo().asString("TIPOENVIOCTE");
   }

   public void setTipoenviocte(String tipoenviocte) {
        markAsChanged("TIPOENVIOCTE", tipoenviocte);
   }

   public String getContingenciacte() {
        return this.getVo().asString("CONTINGENCIACTE");
   }

   public void setContingenciacte(String contingenciacte) {
        markAsChanged("CONTINGENCIACTE", contingenciacte);
   }

   public String getTipodacte() {
        return this.getVo().asString("TIPODACTE");
   }

   public void setTipodacte(String tipodacte) {
        markAsChanged("TIPODACTE", tipodacte);
   }

   public String getJobkeyndd() {
        return this.getVo().asString("JOBKEYNDD");
   }

   public void setJobkeyndd(String jobkeyndd) {
        markAsChanged("JOBKEYNDD", jobkeyndd);
   }

   public String getConectornfse() {
        return this.getVo().asString("CONECTORNFSE");
   }

   public void setConectornfse(String conectornfse) {
        markAsChanged("CONECTORNFSE", conectornfse);
   }

   public BigDecimal getCodctactbdesc() {
        return this.getVo().asBigDecimal("CODCTACTBDESC");
   }

   public void setCodctactbdesc(BigDecimal codctactbdesc) {
        markAsChanged("CODCTACTBDESC", codctactbdesc);
   }

   public BigDecimal getCodctactbjuros() {
        return this.getVo().asBigDecimal("CODCTACTBJUROS");
   }

   public void setCodctactbjuros(BigDecimal codctactbjuros) {
        markAsChanged("CODCTACTBJUROS", codctactbjuros);
   }

   public BigDecimal getCodctactbmult() {
        return this.getVo().asBigDecimal("CODCTACTBMULT");
   }

   public void setCodctactbmult(BigDecimal codctactbmult) {
        markAsChanged("CODCTACTBMULT", codctactbmult);
   }

   public BigDecimal getCodendcrossdock() {
        return this.getVo().asBigDecimal("CODENDCROSSDOCK");
   }

   public void setCodendcrossdock(BigDecimal codendcrossdock) {
        markAsChanged("CODENDCROSSDOCK", codendcrossdock);
   }

   public String getCodtrib90creddeb() {
        return this.getVo().asString("CODTRIB90CREDDEB");
   }

   public void setCodtrib90creddeb(String codtrib90creddeb) {
        markAsChanged("CODTRIB90CREDDEB", codtrib90creddeb);
   }

   public String getConicmsmajfcpint() {
        return this.getVo().asString("CONICMSMAJFCPINT");
   }

   public void setConicmsmajfcpint(String conicmsmajfcpint) {
        markAsChanged("CONICMSMAJFCPINT", conicmsmajfcpint);
   }

   public String getConsdevevtr2050() {
        return this.getVo().asString("CONSDEVEVTR2050");
   }

   public void setConsdevevtr2050(String consdevevtr2050) {
        markAsChanged("CONSDEVEVTR2050", consdevevtr2050);
   }

   public String getConsidbenef() {
        return this.getVo().asString("CONSIDBENEF");
   }

   public void setConsidbenef(String considbenef) {
        markAsChanged("CONSIDBENEF", considbenef);
   }

   public String getContingencianfce() {
        return this.getVo().asString("CONTINGENCIANFCE");
   }

   public void setContingencianfce(String contingencianfce) {
        markAsChanged("CONTINGENCIANFCE", contingencianfce);
   }

   public BigDecimal getCopiasdanfce() {
        return this.getVo().asBigDecimal("COPIASDANFCE");
   }

   public void setCopiasdanfce(BigDecimal copiasdanfce) {
        markAsChanged("COPIASDANFCE", copiasdanfce);
   }

   public String getDescredifciap() {
        return this.getVo().asString("DESCREDDIFCIAP");
   }

   public void setDescredifciap(String descredifciap) {
        markAsChanged("DESCREDDIFCIAP", descredifciap);
   }

   public String getDifaliqfcpint() {
        return this.getVo().asString("DIFALIQFCPINT");
   }

   public void setDifaliqfcpint(String difaliqfcpint) {
        markAsChanged("DIFALIQFCPINT", difaliqfcpint);
   }

   public String getEmailnotfecreinf() {
        return this.getVo().asString("EMAILNOTFECREINF");
   }

   public void setEmailnotfecreinf(String emailnotfecreinf) {
        markAsChanged("EMAILNOTFECREINF", emailnotfecreinf);
   }

   public String getEnvemailconf() {
        return this.getVo().asString("ENVEMAILCONF");
   }

   public void setEnvemailconf(String envemailconf) {
        markAsChanged("ENVEMAILCONF", envemailconf);
   }

   public String getEnviosincronocte() {
        return this.getVo().asString("ENVIOSINCRONOCTE");
   }

   public void setEnviosincronocte(String enviosincronocte) {
        markAsChanged("ENVIOSINCRONOCTE", enviosincronocte);
   }

   public String getEnviosincrononfce() {
        return this.getVo().asString("ENVIOSINCRONONFCE");
   }

   public void setEnviosincrononfce(String enviosincrononfce) {
        markAsChanged("ENVIOSINCRONONFCE", enviosincrononfce);
   }

   public String getEnviosincrononfe() {
        return this.getVo().asString("ENVIOSINCRONONFE");
   }

   public void setEnviosincrononfe(String enviosincrononfe) {
        markAsChanged("ENVIOSINCRONONFE", enviosincrononfe);
   }

   public BigDecimal getGerarretencao() {
        return this.getVo().asBigDecimal("GERARRETENCAO");
   }

   public void setGerarretencao(BigDecimal gerarretencao) {
        markAsChanged("GERARRETENCAO", gerarretencao);
   }

   public String getGerartaxfinembnfe() {
        return this.getVo().asString("GERARTAXFINEMBNFE");
   }

   public void setGerartaxfinembnfe(String gerartaxfinembnfe) {
        markAsChanged("GERARTAXFINEMBNFE", gerartaxfinembnfe);
   }

   public String getIgcertifsmtpxml() {
        return this.getVo().asString("IGCERTIFSMTPXML");
   }

   public void setIgcertifsmtpxml(String igcertifsmtpxml) {
        markAsChanged("IGCERTIFSMTPXML", igcertifsmtpxml);
   }

   public String getInsxmlporimpsmtpxml() {
        return this.getVo().asString("INSXMLPORIMPSMTPXML");
   }

   public void setInsxmlporimpsmtpxml(String insxmlporimpsmtpxml) {
        markAsChanged("INSXMLPORIMPSMTPXML", insxmlporimpsmtpxml);
   }

   public BigDecimal getIntconssmtpxml() {
        return this.getVo().asBigDecimal("INTCONSSMTPXML");
   }

   public void setIntconssmtpxml(BigDecimal intconssmtpxml) {
        markAsChanged("INTCONSSMTPXML", intconssmtpxml);
   }

   public String getNfestantconsfinal() {
        return this.getVo().asString("NFESTANTCONSFINAL");
   }

   public void setNfestantconsfinal(String nfestantconsfinal) {
        markAsChanged("NFESTANTCONSFINAL", nfestantconsfinal);
   }

   public BigDecimal getNotaentajustestcons() {
        return this.getVo().asBigDecimal("NOTAENTAJUSTESTCONS");
   }

   public void setNotaentajustestcons(BigDecimal notaentajustestcons) {
        markAsChanged("NOTAENTAJUSTESTCONS", notaentajustestcons);
   }

   public BigDecimal getNotaentajustestcter() {
        return this.getVo().asBigDecimal("NOTAENTAJUSTESTCTER");
   }

   public void setNotaentajustestcter(BigDecimal notaentajustestcter) {
        markAsChanged("NOTAENTAJUSTESTCTER", notaentajustestcter);
   }

   public BigDecimal getNotaentajustestdter() {
        return this.getVo().asBigDecimal("NOTAENTAJUSTESTDTER");
   }

   public void setNotaentajustestdter(BigDecimal notaentajustestdter) {
        markAsChanged("NOTAENTAJUSTESTDTER", notaentajustestdter);
   }

   public BigDecimal getNotasaiajustbem() {
        return this.getVo().asBigDecimal("NOTASAIAJUSTBEM");
   }

   public void setNotasaiajustbem(BigDecimal notasaiajustbem) {
        markAsChanged("NOTASAIAJUSTBEM", notasaiajustbem);
   }

   public BigDecimal getNotasaiajustestcons() {
        return this.getVo().asBigDecimal("NOTASAIAJUSTESTCONS");
   }

   public void setNotasaiajustestcons(BigDecimal notasaiajustestcons) {
        markAsChanged("NOTASAIAJUSTESTCONS", notasaiajustestcons);
   }

   public BigDecimal getNotasaiajustestcter() {
        return this.getVo().asBigDecimal("NOTASAIAJUSTESTCTER");
   }

   public void setNotasaiajustestcter(BigDecimal notasaiajustestcter) {
        markAsChanged("NOTASAIAJUSTESTCTER", notasaiajustestcter);
   }

   public BigDecimal getNotasaiajustestdter() {
        return this.getVo().asBigDecimal("NOTASAIAJUSTESTDTER");
   }

   public void setNotasaiajustestdter(BigDecimal notasaiajustestdter) {
        markAsChanged("NOTASAIAJUSTESTDTER", notasaiajustestdter);
   }

   public String getNumdocr2020() {
        return this.getVo().asString("NUMDOCR2020");
   }

   public void setNumdocr2020(String numdocr2020) {
        markAsChanged("NUMDOCR2020", numdocr2020);
   }

   public BigDecimal getNunotademfx() {
        return this.getVo().asBigDecimal("NUNOTADEMFX");
   }

   public void setNunotademfx(BigDecimal nunotademfx) {
        markAsChanged("NUNOTADEMFX", nunotademfx);
   }

   public BigDecimal getNunotamodfx() {
        return this.getVo().asBigDecimal("NUNOTAMODFX");
   }

   public void setNunotamodfx(BigDecimal nunotamodfx) {
        markAsChanged("NUNOTAMODFX", nunotamodfx);
   }

   public BigDecimal getNunotatrcfx() {
        return this.getVo().asBigDecimal("NUNOTATRCFX");
   }

   public void setNunotatrcfx(BigDecimal nunotatrcfx) {
        markAsChanged("NUNOTATRCFX", nunotatrcfx);
   }

   public String getOrigprodcomipi() {
        return this.getVo().asString("ORIGPRODCOMIPI");
   }

   public void setOrigprodcomipi(String origprodcomipi) {
        markAsChanged("ORIGPRODCOMIPI", origprodcomipi);
   }

   public String getPermoutroususepped() {
        return this.getVo().asString("PERMOUTROUSUSEPPED");
   }

   public void setPermoutroususepped(String permoutroususepped) {
        markAsChanged("PERMOUTROUSUSEPPED", permoutroususepped);
   }

   public BigDecimal getPortasmtpxml() {
        return this.getVo().asBigDecimal("PORTASMTPXML");
   }

   public void setPortasmtpxml(BigDecimal portasmtpxml) {
        markAsChanged("PORTASMTPXML", portasmtpxml);
   }

   public String getProgaquisalim() {
        return this.getVo().asString("PROGAQUISALIM");
   }

   public void setProgaquisalim(String progaquisalim) {
        markAsChanged("PROGAQUISALIM", progaquisalim);
   }

   public Timestamp getProxexecsmtpxml() {
        return this.getVo().asTimestamp("PROXEXECSMTPXML");
   }

   public void setProxexecsmtpxml(Timestamp proxexecsmtpxml) {
        markAsChanged("PROXEXECSMTPXML", proxexecsmtpxml);
   }

   public String getQrcodenfceversao2() {
        return this.getVo().asString("QRCODENFCEVERSAO2");
   }

   public void setQrcodenfceversao2(String qrcodenfceversao2) {
        markAsChanged("QRCODENFCEVERSAO2", qrcodenfceversao2);
   }

   public String getRedissbcpisconf() {
        return this.getVo().asString("REDISSBCPISCONF");
   }

   public void setRedissbcpisconf(String redissbcpisconf) {
        markAsChanged("REDISSBCPISCONF", redissbcpisconf);
   }

   public String getRedstcompbcpiscofins() {
        return this.getVo().asString("REDSTCOMPBCPISCOFINS");
   }

   public void setRedstcompbcpiscofins(String redstcompbcpiscofins) {
        markAsChanged("REDSTCOMPBCPISCOFINS", redstcompbcpiscofins);
   }

   public String getSenhasmtpxml() {
        return this.getVo().asString("SENHASMTPXML");
   }

   public void setSenhasmtpxml(String senhasmtpxml) {
        markAsChanged("SENHASMTPXML", senhasmtpxml);
   }

   public String getServidorsmtpxml() {
        return this.getVo().asString("SERVIDORSMTPXML");
   }

   public void setServidorsmtpxml(String servidorsmtpxml) {
        markAsChanged("SERVIDORSMTPXML", servidorsmtpxml);
   }

   public String getSuprimiremaildest() {
        return this.getVo().asString("SUPRIMIREMAILDEST");
   }

   public void setSuprimiremaildest(String suprimiremaildest) {
        markAsChanged("SUPRIMIREMAILDEST", suprimiremaildest);
   }

   public String getTipconexsmtpxml() {
        return this.getVo().asString("TIPCONEXSMTPXML");
   }

   public void setTipconexsmtpxml(String tipconexsmtpxml) {
        markAsChanged("TIPCONEXSMTPXML", tipconexsmtpxml);
   }

   public String getTipdataevtserv() {
        return this.getVo().asString("TIPDATAEVTSERV");
   }

   public void setTipdataevtserv(String tipdataevtserv) {
        markAsChanged("TIPDATAEVTSERV", tipdataevtserv);
   }

   public String getTipgerinfgveicgreb() {
        return this.getVo().asString("TIPGERINFGVEICGREB");
   }

   public void setTipgerinfgveicgreb(String tipgerinfgveicgreb) {
        markAsChanged("TIPGERINFGVEICGREB", tipgerinfgveicgreb);
   }

   public String getTipoenvionfce() {
        return this.getVo().asString("TIPOENVIONFCE");
   }

   public void setTipoenvionfce(String tipoenvionfce) {
        markAsChanged("TIPOENVIONFCE", tipoenvionfce);
   }

   public String getUltnsucte() {
        return this.getVo().asString("ULTNSUCTE");
   }

   public void setUltnsucte(String ultnsucte) {
        markAsChanged("ULTNSUCTE", ultnsucte);
   }

   public String getUsacodbarrasconcatwms() {
        return this.getVo().asString("USACODBARRASCONCATWMS");
   }

   public void setUsacodbarrasconcatwms(String usacodbarrasconcatwms) {
        markAsChanged("USACODBARRASCONCATWMS", usacodbarrasconcatwms);
   }

   public String getUsanomecomplitem() {
        return this.getVo().asString("USANOMECOMPLITEM");
   }

   public void setUsanomecomplitem(String usanomecomplitem) {
        markAsChanged("USANOMECOMPLITEM", usanomecomplitem);
   }

   public String getUsarecparcial() {
        return this.getVo().asString("USARECPARCIAL");
   }

   public void setUsarecparcial(String usarecparcial) {
        markAsChanged("USARECPARCIAL", usarecparcial);
   }

   public String getUsasttextnotarestst() {
        return this.getVo().asString("USASTEXTNOTARESTST");
   }

   public void setUsasttextnotarestst(String usasttextnotarestst) {
        markAsChanged("USASTEXTNOTARESTST", usasttextnotarestst);
   }

   public String getUsuariosmtpxml() {
        return this.getVo().asString("USUARIOSMTPXML");
   }

   public void setUsuariosmtpxml(String usuariosmtpxml) {
        markAsChanged("USUARIOSMTPXML", usuariosmtpxml);
   }

   public String getUtilizadfetransp() {
        return this.getVo().asString("UTILIZADFETRANSP");
   }

   public void setUtilizadfetransp(String utilizadfetransp) {
        markAsChanged("UTILIZADFETRANSP", utilizadfetransp);
   }

   public String getUtilizaexplotesep() {
        return this.getVo().asString("UTILIZAEXPLOTESEP");
   }

   public void setUtilizaexplotesep(String utilizaexplotesep) {
        markAsChanged("UTILIZAEXPLOTESEP", utilizaexplotesep);
   }

   public String getUtilizaseppulmao() {
        return this.getVo().asString("UTILIZASEPPULMAO");
   }

   public void setUtilizaseppulmao(String utilizaseppulmao) {
        markAsChanged("UTILIZASEPPULMAO", utilizaseppulmao);
   }

   public String getUtilizatricrossdocking() {
        return this.getVo().asString("UTILIZATRICROSSDOCKING");
   }

   public void setUtilizatricrossdocking(String utilizatricrossdocking) {
        markAsChanged("UTILIZATRICROSSDOCKING", utilizatricrossdocking);
   }

   public BigDecimal getVersaoNt() {
        return this.getVo().asBigDecimal("VERSAONT");
   }

   public void setVersaoNt(BigDecimal versaoNt) {
        markAsChanged("VERSAONT", versaoNt);
   }

   public BigDecimal getVersaoNtCte() {
        return this.getVo().asBigDecimal("VERSAONTCTE");
   }

   public void setVersaoNtCte(BigDecimal versaoNtCte) {
        markAsChanged("VERSAONTCTE", versaoNtCte);
   }

   public BigDecimal getVersaoNtMdfe() {
        return this.getVo().asBigDecimal("VERSAONTMDFE");
   }

   public void setVersaoNtMdfe(BigDecimal versaoNtMdfe) {
        markAsChanged("VERSAONTMDFE", versaoNtMdfe);
   }

   public String getWmsArmTotalCol() {
        return this.getVo().asString("WMSARMTOTALCOL");
   }

   public void setWmsArmTotalCol(String wmsArmTotalCol) {
        markAsChanged("WMSARMTOTALCOL", wmsArmTotalCol);
   }

   public String getWmsInfoPesoDetVol() {
        return this.getVo().asString("WMSINFOPESODETVOL");
   }

   public void setWmsInfoPesoDetVol(String wmsInfoPesoDetVol) {
        markAsChanged("WMSINFOPESODETVOL", wmsInfoPesoDetVol);
   }

   public String getWmsMultiUsuConf() {
        return this.getVo().asString("WMSMULTIUSUCONF");
   }

   public void setWmsMultiUsuConf(String wmsMultiUsuConf) {
        markAsChanged("WMSMULTIUSUCONF", wmsMultiUsuConf);
   }

   public String getWmsUsaImpFechaVol() {
        return this.getVo().asString("WMSUSAIMPFECHAVOL");
   }

   public void setWmsUsaImpFechaVol(String wmsUsaImpFechaVol) {
        markAsChanged("WMSUSAIMPFECHAVOL", wmsUsaImpFechaVol);
   }

   public String getWmsUsaRegVolRec() {
        return this.getVo().asString("WMSUSAREGVOLREC");
   }

   public void setWmsUsaRegVolRec(String wmsUsaRegVolRec) {
        markAsChanged("WMSUSAREGVOLREC", wmsUsaRegVolRec);
   }

   public String getAedFe() {
        return this.getVo().asString("AEDFE");
   }

   public void setAedFe(String aedFe) {
        markAsChanged("AEDFE", aedFe);
   }

   public String getAtualCbEnefFat() {
        return this.getVo().asString("ATUALCBENEFFAT");
   }

   public void setAtualCbEnefFat(String atualCbEnefFat) {
        markAsChanged("ATUALCBENEFFAT", atualCbEnefFat);
   }

   public String getCalcIcmsStNaoCont() {
        return this.getVo().asString("CALCICMSSTNAOCONT");
   }

   public void setCalcIcmsStNaoCont(String calcIcmsStNaoCont) {
        markAsChanged("CALCICMSSTNAOCONT", calcIcmsStNaoCont);
   }

   public BigDecimal getCodTabCkc() {
        return this.getVo().asBigDecimal("CODTABCKC");
   }

   public void setCodTabCkc(BigDecimal codTabCkc) {
        markAsChanged("CODTABCKC", codTabCkc);
   }

   public String getReabCompleto() {
        return this.getVo().asString("REABCOMPLETO");
   }

   public void setReabCompleto(String reabCompleto) {
        markAsChanged("REABCOMPLETO", reabCompleto);
   }

   public BigDecimal getAliqCfBonif() {
        return this.getVo().asBigDecimal("ALIQCFBONIF");
   }

   public void setAliqCfBonif(BigDecimal aliqCfBonif) {
        markAsChanged("ALIQCFBONIF", aliqCfBonif);
   }

   public BigDecimal getAliqPisBonif() {
        return this.getVo().asBigDecimal("ALIQPISBONIF");
   }

   public void setAliqPisBonif(BigDecimal aliqPisBonif) {
        markAsChanged("ALIQPISBONIF", aliqPisBonif);
   }

   public BigDecimal getCodCtaCtbBonif() {
        return this.getVo().asBigDecimal("CODCTACTBBONIF");
   }

   public void setCodCtaCtbBonif(BigDecimal codCtaCtbBonif) {
        markAsChanged("CODCTACTBBONIF", codCtaCtbBonif);
   }

   public String getCodStPisCfBonif() {
        return this.getVo().asString("CODSTPISCFBONIF");
   }

   public void setCodStPisCfBonif(String codStPisCfBonif) {
        markAsChanged("CODSTPISCFBONIF", codStPisCfBonif);
   }

   public String getMdfeDocSemIsProp() {
        return this.getVo().asString("MDFEDOCSEMISPROPRIA");
   }

   public void setMdfeDocSemIsProp(String mdfeDocSemIsProp) {
        markAsChanged("MDFEDOCSEMISPROPRIA", mdfeDocSemIsProp);
   }

   public BigDecimal getNuRfeCartaCorrCte() {
        return this.getVo().asBigDecimal("NURFECARTACORRCTE");
   }

   public void setNuRfeCartaCorrCte(BigDecimal nuRfeCartaCorrCte) {
        markAsChanged("NURFECARTACORRCTE", nuRfeCartaCorrCte);
   }

   public String getTribPisCfBonif() {
        return this.getVo().asString("TRIBPISCFBONIF");
   }

   public void setTribPisCfBonif(String tribPisCfBonif) {
        markAsChanged("TRIBPISCFBONIF", tribPisCfBonif);
   }

   public String getGerLivIcmsEmpSn() {
        return this.getVo().asString("GERLIVICMSEMPSN");
   }

   public void setGerLivIcmsEmpSn(String gerLivIcmsEmpSn) {
        markAsChanged("GERLIVICMSEMPSN", gerLivIcmsEmpSn);
   }

   public BigDecimal getCodForDifAliq() {
        return this.getVo().asBigDecimal("CODFORDIFALIQ");
   }

   public void setCodForDifAliq(BigDecimal codForDifAliq) {
        markAsChanged("CODFORDIFALIQ", codForDifAliq);
   }

   public String getDefCstIpi00() {
        return this.getVo().asString("DEFCSTIPI00");
   }

   public void setDefCstIpi00(String defCstIpi00) {
        markAsChanged("DEFCSTIPI00", defCstIpi00);
   }

   public String getDefCstIpi01() {
        return this.getVo().asString("DEFCSTIPI01");
   }

   public void setDefCstIpi01(String defCstIpi01) {
        markAsChanged("DEFCSTIPI01", defCstIpi01);
   }

   public String getDefCstIpi02() {
        return this.getVo().asString("DEFCSTIPI02");
   }

   public void setDefCstIpi02(String defCstIpi02) {
        markAsChanged("DEFCSTIPI02", defCstIpi02);
   }

   public String getDefCstIpi03() {
        return this.getVo().asString("DEFCSTIPI03");
   }

   public void setDefCstIpi03(String defCstIpi03) {
        markAsChanged("DEFCSTIPI03", defCstIpi03);
   }

   public String getDefCstIpi04() {
        return this.getVo().asString("DEFCSTIPI04");
   }

   public void setDefCstIpi04(String defCstIpi04) {
        markAsChanged("DEFCSTIPI04", defCstIpi04);
   }

   public String getDefCstIpi05() {
        return this.getVo().asString("DEFCSTIPI05");
   }

   public void setDefCstIpi05(String defCstIpi05) {
        markAsChanged("DEFCSTIPI05", defCstIpi05);
   }

   public String getDefCstIpi49() {
        return this.getVo().asString("DEFCSTIPI49");
   }

   public void setDefCstIpi49(String defCstIpi49) {
        markAsChanged("DEFCSTIPI49", defCstIpi49);
   }

   public String getDefCstIpi50() {
        return this.getVo().asString("DEFCSTIPI50");
   }

   public void setDefCstIpi50(String defCstIpi50) {
        markAsChanged("DEFCSTIPI50", defCstIpi50);
   }

   public String getDefCstIpi51() {
        return this.getVo().asString("DEFCSTIPI51");
   }

   public void setDefCstIpi51(String defCstIpi51) {
        markAsChanged("DEFCSTIPI51", defCstIpi51);
   }

   public String getDefCstIpi52() {
        return this.getVo().asString("DEFCSTIPI52");
   }

   public void setDefCstIpi52(String defCstIpi52) {
        markAsChanged("DEFCSTIPI52", defCstIpi52);
   }

   public String getDefCstIpi53() {
        return this.getVo().asString("DEFCSTIPI53");
   }

   public void setDefCstIpi53(String defCstIpi53) {
        markAsChanged("DEFCSTIPI53", defCstIpi53);
   }

   public String getDefCstIpi54() {
        return this.getVo().asString("DEFCSTIPI54");
   }

   public void setDefCstIpi54(String defCstIpi54) {
        markAsChanged("DEFCSTIPI54", defCstIpi54);
   }

   public String getDefCstIpi55() {
        return this.getVo().asString("DEFCSTIPI55");
   }

   public void setDefCstIpi55(String defCstIpi55) {
        markAsChanged("DEFCSTIPI55", defCstIpi55);
   }

   public String getDefCstIpi99() {
        return this.getVo().asString("DEFCSTIPI99");
   }

   public void setDefCstIpi99(String defCstIpi99) {
        markAsChanged("DEFCSTIPI99", defCstIpi99);
   }

   public String getIpiTributDefEmp() {
        return this.getVo().asString("IPITRIBUTDEFEMP");
   }

   public void setIpiTributDefEmp(String ipiTributDefEmp) {
        markAsChanged("IPITRIBUTDEFEMP", ipiTributDefEmp);
   }

   public String getEscritCompraEmissProp() {
        return this.getVo().asString("ESCRITCOMPRAEMISSPROP");
   }

   public void setEscritCompraEmissProp(String escritCompraEmissProp) {
        markAsChanged("ESCRITCOMPRAEMISSPROP", escritCompraEmissProp);
   }

   public String getGerNotaEntCanc() {
        return this.getVo().asString("GERNOTAENTCANC");
   }

   public void setGerNotaEntCanc(String gerNotaEntCanc) {
        markAsChanged("GERNOTAENTCANC", gerNotaEntCanc);
   }

   public String getMetCalcDifIcms() {
        return this.getVo().asString("METCALCDIFICMS");
   }

   public void setMetCalcDifIcms(String metCalcDifIcms) {
        markAsChanged("METCALCDIFICMS", metCalcDifIcms);
   }

   public BigDecimal getPesMaxSepaGru() {
        return this.getVo().asBigDecimal("PESMAXSEPAGRU");
   }

   public void setPesMaxSepaGru(BigDecimal pesMaxSepaGru) {
        markAsChanged("PESMAXSEPAGRU", pesMaxSepaGru);
   }

   public String getUsaSepaGruProd() {
        return this.getVo().asString("USASEPAGRUPROD");
   }

   public void setUsaSepaGruProd(String usaSepaGruProd) {
        markAsChanged("USASEPAGRUPROD", usaSepaGruProd);
   }

   public BigDecimal getQtPedSepaGr() {
        return this.getVo().asBigDecimal("QTPEDSEPAGR");
   }

   public void setQtPedSepaGr(BigDecimal qtPedSepaGr) {
        markAsChanged("QTPEDSEPAGR", qtPedSepaGr);
   }

   public BigDecimal getQtCheckSep() {
        return this.getVo().asBigDecimal("QTCHECKSEP");
   }

   public void setQtCheckSep(BigDecimal qtCheckSep) {
        markAsChanged("QTCHECKSEP", qtCheckSep);
   }

   public BigDecimal getVolCheckSepRod() {
        return this.getVo().asBigDecimal("VOLCHECKSEPROD");
   }

   public void setVolCheckSepRod(BigDecimal volCheckSepRod) {
        markAsChanged("VOLCHECKSEPROD", volCheckSepRod);
   }

   public String getConsRepIcmsBasePisCof() {
        return this.getVo().asString("CONSREPICMSBASEPISCOF");
   }

   public void setConsRepIcmsBasePisCof(String consRepIcmsBasePisCof) {
        markAsChanged("CONSREPICMSBASEPISCOF", consRepIcmsBasePisCof);
   }

   public BigDecimal getAliqPisDesc() {
        return this.getVo().asBigDecimal("ALIQPISDESC");
   }

   public void setAliqPisDesc(BigDecimal aliqPisDesc) {
        markAsChanged("ALIQPISDESC", aliqPisDesc);
   }

   public BigDecimal getAliqCfJuros() {
        return this.getVo().asBigDecimal("ALIQCFJUROS");
   }

   public void setAliqCfJuros(BigDecimal aliqCfJuros) {
        markAsChanged("ALIQCFJUROS", aliqCfJuros);
   }

   public BigDecimal getLocalPadEConect() {
        return this.getVo().asBigDecimal("LOCALPADECONECT");
   }

   public void setLocalPadEConect(BigDecimal localPadEConect) {
        markAsChanged("LOCALPADECONECT", localPadEConect);
   }

   public BigDecimal getAliqCfDesc() {
        return this.getVo().asBigDecimal("ALIQCFDESC");
   }

   public void setAliqCfDesc(BigDecimal aliqCfDesc) {
        markAsChanged("ALIQCFDESC", aliqCfDesc);
   }

   public String getJobMdEndDigital() {
        return this.getVo().asString("JOBMDENDDIGITAL");
   }

   public void setJobMdEndDigital(String jobMdEndDigital) {
        markAsChanged("JOBMDENDDIGITAL", jobMdEndDigital);
   }

   public String getCodStPisCfDesc() {
        return this.getVo().asString("CODSTPISCFDESC");
   }

   public void setCodStPisCfDesc(String codStPisCfDesc) {
        markAsChanged("CODSTPISCFDESC", codStPisCfDesc);
   }

   public String getCodStPisCfJuros() {
        return this.getVo().asString("CODSTPISCFJUROS");
   }

   public void setCodStPisCfJuros(String codStPisCfJuros) {
        markAsChanged("CODSTPISCFJUROS", codStPisCfJuros);
   }

   public BigDecimal getAliqPisJuros() {
        return this.getVo().asBigDecimal("ALIQPISJUROS");
   }

   public void setAliqPisJuros(BigDecimal aliqPisJuros) {
        markAsChanged("ALIQPISJUROS", aliqPisJuros);
   }

   public String getTribPisCfDesc() {
        return this.getVo().asString("TRIBPISCFDESC");
   }

   public void setTribPisCfDesc(String tribPisCfDesc) {
        markAsChanged("TRIBPISCFDESC", tribPisCfDesc);
   }

   public String getTribPisCfJuros() {
        return this.getVo().asString("TRIBPISCFJUROS");
   }

   public void setTribPisCfJuros(String tribPisCfJuros) {
        markAsChanged("TRIBPISCFJUROS", tribPisCfJuros);
   }

   public BigDecimal getAliqPisMult() {
        return this.getVo().asBigDecimal("ALIQPISMULT");
   }

   public void setAliqPisMult(BigDecimal aliqPisMult) {
        markAsChanged("ALIQPISMULT", aliqPisMult);
   }

   public BigDecimal getAliqCfMult() {
        return this.getVo().asBigDecimal("ALIQCFMULT");
   }

   public void setAliqCfMult(BigDecimal aliqCfMult) {
        markAsChanged("ALIQCFMULT", aliqCfMult);
   }

   public String getCodStPisCfMult() {
        return this.getVo().asString("CODSTPISCFMULT");
   }

   public void setCodStPisCfMult(String codStPisCfMult) {
        markAsChanged("CODSTPISCFMULT", codStPisCfMult);
   }

   public String getTribPisCfMult() {
        return this.getVo().asString("TRIBPISCFMULT");
   }

   public void setTribPisCfMult(String tribPisCfMult) {
        markAsChanged("TRIBPISCFMULT", tribPisCfMult);
   }

   public String getCertificadoPix() {
        return this.getVo().asString("CERTIFICADOPIX");
   }

   public void setCertificadoPix(String certificadoPix) {
        markAsChanged("CERTIFICADOPIX", certificadoPix);
   }

   public String getImpCteEmisProp() {
        return this.getVo().asString("IMPCTEEMISPROP");
   }

   public void setImpCteEmisProp(String impCteEmisProp) {
        markAsChanged("IMPCTEEMISPROP", impCteEmisProp);
   }

   public BigDecimal getCodEndRetExp() {
        return this.getVo().asBigDecimal("CODENDRETEXP");
   }

   public void setCodEndRetExp(BigDecimal codEndRetExp) {
        markAsChanged("CODENDRETEXP", codEndRetExp);
   }

   public String getRedIcmsBcPisConfins() {
        return this.getVo().asString("REDICMSBCPISCONFINS");
   }

   public void setRedIcmsBcPisConfins(String redIcmsBcPisConfins) {
        markAsChanged("REDICMSBCPISCONFINS", redIcmsBcPisConfins);
   }

   public String getUltNsu() {
        return this.getVo().asString("ULTNSU");
   }

   public void setUltNsu(String ultNsu) {
        markAsChanged("ULTNSU", ultNsu);
   }

   public String getUsaInfoAdConfPed() {
        return this.getVo().asString("USAINFOADCONFPED");
   }

   public void setUsaInfoAdConfPed(String usaInfoAdConfPed) {
        markAsChanged("USAINFOADCONFPED", usaInfoAdConfPed);
   }

   public BigDecimal getNfSeObsIterPs() {
        return this.getVo().asBigDecimal("NFSEOBSITERPS");
   }

   public void setNfSeObsIterPs(BigDecimal nfSeObsIterPs) {
        markAsChanged("NFSEOBSITERPS", nfSeObsIterPs);
   }

   public BigDecimal getQtdCarNfSeObsIterPs() {
        return this.getVo().asBigDecimal("QTDCARNFSEOBSITERPS");
   }

   public void setQtdCarNfSeObsIterPs(BigDecimal qtdCarNfSeObsIterPs) {
        markAsChanged("QTDCARNFSEOBSITERPS", qtdCarNfSeObsIterPs);
   }

   public String getCaepf() {
        return this.getVo().asString("CAEPF");
   }

   public void setCaepf(String caepf) {
        markAsChanged("CAEPF", caepf);
   }

   public String getCafir() {
        return this.getVo().asString("CAFIR");
   }

   public void setCafir(String cafir) {
        markAsChanged("CAFIR", cafir);
   }

   public String getGerAlcdPr() {
        return this.getVo().asString("GERALCDPR");
   }

   public void setGerAlcdPr(String gerAlcdPr) {
        markAsChanged("GERALCDPR", gerAlcdPr);
   }

   public String getTipoExploracao() {
        return this.getVo().asString("TIPOEXPLORACAO");
   }

   public void setTipoExploracao(String tipoExploracao) {
        markAsChanged("TIPOEXPLORACAO", tipoExploracao);
   }

   public String getBaixaFinPreEmissNfce() {
        return this.getVo().asString("BAIXAFINPREEMISSNFCE");
   }

   public void setBaixaFinPreEmissNfce(String baixaFinPreEmissNfce) {
        markAsChanged("BAIXAFINPREEMISSNFCE", baixaFinPreEmissNfce);
   }

   public String getIcmsNormalDifIcmsSn() {
        return this.getVo().asString("ICMSNORMALDIFICMSSN");
   }

   public void setIcmsNormalDifIcmsSn(String icmsNormalDifIcmsSn) {
        markAsChanged("ICMSNORMALDIFICMSSN", icmsNormalDifIcmsSn);
   }

   public String getDirFcpfResp() {
        return this.getVo().asString("DIRFCPFRESP");
   }

   public void setDirFcpfResp(String dirFcpfResp) {
        markAsChanged("DIRFCPFRESP", dirFcpfResp);
   }

   public String getDirFDepDecJud() {
        return this.getVo().asString("DIRFDEPDECJUD");
   }

   public void setDirFDepDecJud(String dirFDepDecJud) {
        markAsChanged("DIRFDEPDECJUD", dirFDepDecJud);
   }

   public String getDirFDepFunInv() {
        return this.getVo().asString("DIRFDEPFUNINV");
   }

   public void setDirFDepFunInv(String dirFDepFunInv) {
        markAsChanged("DIRFDEPFUNINV", dirFDepFunInv);
   }

   public Timestamp getDirFdhEvento() {
        return this.getVo().asTimestamp("DIRFDHEVENTO");
   }

   public void setDirFdhEvento(Timestamp dirFdhEvento) {
        markAsChanged("DIRFDHEVENTO", dirFdhEvento);
   }

   public String getDirFEntImune() {
        return this.getVo().asString("DIRFENTIMUNE");
   }

   public void setDirFEntImune(String dirFEntImune) {
        markAsChanged("DIRFENTIMUNE", dirFEntImune);
   }

   public String getDirFNatDecl() {
        return this.getVo().asString("DIRFNATDECL");
   }

   public void setDirFNatDecl(String dirFNatDecl) {
        markAsChanged("DIRFNATDECL", dirFNatDecl);
   }

   public String getDirFPgExt() {
        return this.getVo().asString("DIRFPGEXT");
   }

   public void setDirFPgExt(String dirFPgExt) {
        markAsChanged("DIRFPGEXT", dirFPgExt);
   }

   public String getDirFPgFundPub() {
        return this.getVo().asString("DIRFPGFUNDPUB");
   }

   public void setDirFPgFundPub(String dirFPgFundPub) {
        markAsChanged("DIRFPGFUNDPUB", dirFPgFundPub);
   }

   public String getDirFPlPriAss() {
        return this.getVo().asString("DIRFPLPRIASS");
   }

   public void setDirFPlPriAss(String dirFPlPriAss) {
        markAsChanged("DIRFPLPRIASS", dirFPlPriAss);
   }

   public String getDirFSitEsp() {
        return this.getVo().asString("DIRFSITESP");
   }

   public void setDirFSitEsp(String dirFSitEsp) {
        markAsChanged("DIRFSITESP", dirFSitEsp);
   }

   public String getDirFSocost() {
        return this.getVo().asString("DIRFSOCOST");
   }

   public void setDirFSocost(String dirFSocost) {
        markAsChanged("DIRFSOCOST", dirFSocost);
   }

   public String getTempRemicaoEstadual() {
        return this.getVo().asString("TEMPREMIACAOESTADUAL");
   }

   public void setTempRemicaoEstadual(String tempRemicaoEstadual) {
        markAsChanged("TEMPREMIACAOESTADUAL", tempRemicaoEstadual);
   }

   public BigDecimal getCodClassifEstab() {
        return this.getVo().asBigDecimal("CODCLASSIFESTAB");
   }

   public void setCodClassifEstab(BigDecimal codClassifEstab) {
        markAsChanged("CODCLASSIFESTAB", codClassifEstab);
   }

   public String getRedPisBcPisCofins() {
        return this.getVo().asString("REDPISBCPISCOFINS");
   }

   public void setRedPisBcPisCofins(String redPisBcPisCofins) {
        markAsChanged("REDPISBCPISCOFINS", redPisBcPisCofins);
   }

   public BigDecimal getNuRfeProducao() {
        return this.getVo().asBigDecimal("NURFEPRODUCAO");
   }

   public void setNuRfeProducao(BigDecimal nuRfeProducao) {
        markAsChanged("NURFEPRODUCAO", nuRfeProducao);
   }

   public String getImpressoraEtqSep() {
        return this.getVo().asString("IMPRESSORAETQSEP");
   }

   public void setImpressoraEtqSep(String impressoraEtqSep) {
        markAsChanged("IMPRESSORAETQSEP", impressoraEtqSep);
   }

   public String getFiltroAliqIcmsSql() {
        return this.getVo().asString("FILTROALIQICMSSQL");
   }

   public void setFiltroAliqIcmsSql(String filtroAliqIcmsSql) {
        markAsChanged("FILTROALIQICMSSQL", filtroAliqIcmsSql);
   }

   public String getClasConsAgua() {
        return this.getVo().asString("CLASCONS_AGUA");
   }

   public void setClasConsAgua(String clasConsAgua) {
        markAsChanged("CLASCONS_AGUA", clasConsAgua);
   }

   public String getClasConsEnerg() {
        return this.getVo().asString("CLASCONS_ENERG");
   }

   public void setClasConsEnerg(String clasConsEnerg) {
        markAsChanged("CLASCONS_ENERG", clasConsEnerg);
   }

   public String getClasConsGas() {
        return this.getVo().asString("CLASCONS_GAS");
   }

   public void setClasConsGas(String clasConsGas) {
        markAsChanged("CLASCONS_GAS", clasConsGas);
   }

   public String getIdentEct() {
        return this.getVo().asString("IDENTECT");
   }

   public void setIdentEct(String identEct) {
        markAsChanged("IDENTECT", identEct);
   }

   public String getWmsDocASepBalcao() {
        return this.getVo().asString("WMSDOCASEPBALCAO");
   }

   public void setWmsDocASepBalcao(String wmsDocASepBalcao) {
        markAsChanged("WMSDOCASEPBALCAO", wmsDocASepBalcao);
   }

   public String getEfdh010() {
        return this.getVo().asString("EFDH010");
   }

   public void setEfdh010(String efdh010) {
        markAsChanged("EFDH010", efdh010);
   }

   public String getEfdh010PrTer() {
        return this.getVo().asString("EFDH010_PRTER");
   }

   public void setEfdh010PrTer(String efdh010PrTer) {
        markAsChanged("EFDH010_PRTER", efdh010PrTer);
   }

   public String getEfdh010Ter() {
        return this.getVo().asString("EFDH010_TER");
   }

   public void setEfdh010Ter(String efdh010Ter) {
        markAsChanged("EFDH010_TER", efdh010Ter);
   }

   public String getUtilizaExplote() {
        return this.getVo().asString("UTILIZAEXPLOTE");
   }

   public void setUtilizaExplote(String utilizaExplote) {
        markAsChanged("UTILIZAEXPLOTE", utilizaExplote);
   }

   public BigDecimal getCodRelMinutaOdp() {
        return this.getVo().asBigDecimal("CODRELMINUTAODP");
   }

   public void setCodRelMinutaOdp(BigDecimal codRelMinutaOdp) {
        markAsChanged("CODRELMINUTAODP", codRelMinutaOdp);
   }

   public String getSenhaEct() {
        return this.getVo().asString("SENHAECT");
   }

   public void setSenhaEct(String senhaEct) {
        markAsChanged("SENHAECT", senhaEct);
   }

   public Timestamp getDtRefPreProdFictReinf() {
        return this.getVo().asTimestamp("DTREFPREPRODFICTREINF");
   }

   public void setDtRefPreProdFictReinf(Timestamp dtRefPreProdFictReinf) {
        markAsChanged("DTREFPREPRODFICTREINF", dtRefPreProdFictReinf);
   }

   public Timestamp getDtRefPreProdReaisReinf() {
        return this.getVo().asTimestamp("DTREFPREPRODREAISREINF");
   }

   public void setDtRefPreProdReaisReinf(Timestamp dtRefPreProdReaisReinf) {
        markAsChanged("DTREFPREPRODREAISREINF", dtRefPreProdReaisReinf);
   }

   public Timestamp getDtRefProdReinf() {
        return this.getVo().asTimestamp("DTREFPRODREINF");
   }

   public void setDtRefProdReinf(Timestamp dtRefProdReinf) {
        markAsChanged("DTREFPRODREINF", dtRefProdReinf);
   }

   public Timestamp getDtValFinReinf() {
        return this.getVo().asTimestamp("DTVALFINREINF");
   }

   public void setDtValFinReinf(Timestamp dtValFinReinf) {
        markAsChanged("DTVALFINREINF", dtValFinReinf);
   }

   public Timestamp getDtValIniReinf() {
        return this.getVo().asTimestamp("DTVALINIREINF");
   }

   public void setDtValIniReinf(Timestamp dtValIniReinf) {
        markAsChanged("DTVALINIREINF", dtValIniReinf);
   }

   public String getEmpAdmPubDir() {
        return this.getVo().asString("EMPADMPUBDIR");
   }

   public void setEmpAdmPubDir(String empAdmPubDir) {
        markAsChanged("EMPADMPUBDIR", empAdmPubDir);
   }

   public String getEntregaEcd() {
        return this.getVo().asString("ENTREGAECD");
   }

   public void setEntregaEcd(String entregaEcd) {
        markAsChanged("ENTREGAECD", entregaEcd);
   }

   public String getIdentEctRastreio() {
        return this.getVo().asString("IDENTECTRASTREIO");
   }

   public void setIdentEctRastreio(String identEctRastreio) {
        markAsChanged("IDENTECTRASTREIO", identEctRastreio);
   }

   public String getImpNfeEmissProp() {
        return this.getVo().asString("IMPNFEEMISSPROP");
   }

   public void setImpNfeEmissProp(String impNfeEmissProp) {
        markAsChanged("IMPNFEEMISSPROP", impNfeEmissProp);
   }

   public String getPartCanalVerde() {
        return this.getVo().asString("PARTCANALVERDE");
   }

   public void setPartCanalVerde(String partCanalVerde) {
        markAsChanged("PARTCANALVERDE", partCanalVerde);
   }

   public BigDecimal getAmbienteReinf() {
        return this.getVo().asBigDecimal("AMBIENTEREINF");
   }

   public void setAmbienteReinf(BigDecimal ambienteReinf) {
        markAsChanged("AMBIENTEREINF", ambienteReinf);
   }

   public String getCamConvPref() {
        return this.getVo().asString("CAMCONVPREF");
   }

   public void setCamConvPref(String camConvPref) {
        markAsChanged("CAMCONVPREF", camConvPref);
   }

   public String getCnpjEfrVinc() {
        return this.getVo().asString("CNPJEFRVINC");
   }

   public void setCnpjEfrVinc(String cnpjEfrVinc) {
        markAsChanged("CNPJEFRVINC", cnpjEfrVinc);
   }

   public String getDesonerafolhaCprb() {
        return this.getVo().asString("DESONERAFOLHACPRB");
   }

   public void setDesonerafolhaCprb(String desonerafolhaCprb) {
        markAsChanged("DESONERAFOLHACPRB", desonerafolhaCprb);
   }

   public BigDecimal getRespEntReinf() {
        return this.getVo().asBigDecimal("RESPENTREINF");
   }

   public void setRespEntReinf(BigDecimal respEntReinf) {
        markAsChanged("RESPENTREINF", respEntReinf);
   }

   public String getSenhaEctRastreio() {
        return this.getVo().asString("SENHAECTRASTREIO");
   }

   public void setSenhaEctRastreio(String senhaEctRastreio) {
        markAsChanged("SENHAECTRASTREIO", senhaEctRastreio);
   }

   public BigDecimal getSitEmpReinf() {
        return this.getVo().asBigDecimal("SITEMPREINF");
   }

   public void setSitEmpReinf(BigDecimal sitEmpReinf) {
        markAsChanged("SITEMPREINF", sitEmpReinf);
   }

   public String getTipCtActbEfd() {
        return this.getVo().asString("TIPCTACTBEFD");
   }

   public void setTipCtActbEfd(String tipCtActbEfd) {
        markAsChanged("TIPCTACTBEFD", tipCtActbEfd);
   }

   public BigDecimal getTopCorBanEconect() {
        return this.getVo().asBigDecimal("TOPCORBANECONECT");
   }

   public void setTopCorBanEconect(BigDecimal topCorBanEconect) {
        markAsChanged("TOPCORBANECONECT", topCorBanEconect);
   }

   public BigDecimal getTribReinf() {
        return this.getVo().asBigDecimal("TRIBREINF");
   }

   public void setTribReinf(BigDecimal tribReinf) {
        markAsChanged("TRIBREINF", tribReinf);
   }

   public BigDecimal getVersaoCte() {
        return this.getVo().asBigDecimal("VERSAOCTE");
   }

   public void setVersaoCte(BigDecimal versaoCte) {
        markAsChanged("VERSAOCTE", versaoCte);
   }

   public String getVinculoEfr() {
        return this.getVo().asString("VINCULOEFR");
   }

   public void setVinculoEfr(String vinculoEfr) {
        markAsChanged("VINCULOEFR", vinculoEfr);
   }

   public BigDecimal getNroMaxProd() {
        return this.getVo().asBigDecimal("NROMAXPROD");
   }

   public void setNroMaxProd(BigDecimal nroMaxProd) {
        markAsChanged("NROMAXPROD", nroMaxProd);
   }

   public BigDecimal getTpoEmpresa() {
        return this.getVo().asBigDecimal("TPOEMPRESA");
   }

   public void setTpoEmpresa(BigDecimal tpoEmpresa) {
        markAsChanged("TPOEMPRESA", tpoEmpresa);
   }

   public BigDecimal getVersaoMdfe() {
        return this.getVo().asBigDecimal("VERSAOMDFE");
   }

   public void setVersaoMdfe(BigDecimal versaoMdfe) {
        markAsChanged("VERSAOMDFE", versaoMdfe);
   }

   public String getTranspCarga() {
        return this.getVo().asString("TRANSPCARGA");
   }

   public void setTranspCarga(String transpCarga) {
        markAsChanged("TRANSPCARGA", transpCarga);
   }

   public String getUsaDtValLotNfe() {
        return this.getVo().asString("USADTVALLOTNFE");
   }

   public void setUsaDtValLotNfe(String usaDtValLotNfe) {
        markAsChanged("USADTVALLOTNFE", usaDtValLotNfe);
   }

   public String getUsaDtFabLotNfe() {
        return this.getVo().asString("USADTFABLOTNFE");
   }

   public void setUsaDtFabLotNfe(String usaDtFabLotNfe) {
        markAsChanged("USADTFABLOTNFE", usaDtFabLotNfe);
   }

   public BigDecimal getModEtqVol() {
        return this.getVo().asBigDecimal("MODETQVOL");
   }

   public void setModEtqVol(BigDecimal modEtqVol) {
        markAsChanged("MODETQVOL", modEtqVol);
   }

   public String getIgPermCompProds() {
        return this.getVo().asString("IGPERMCOMPPRODS");
   }

   public void setIgPermCompProds(String igPermCompProds) {
        markAsChanged("IGPERMCOMPPRODS", igPermCompProds);
   }

   public String getImpressoraEtqVol() {
        return this.getVo().asString("IMPRESSORAETQVOL");
   }

   public void setImpressoraEtqVol(String impressoraEtqVol) {
        markAsChanged("IMPRESSORAETQVOL", impressoraEtqVol);
   }

   public String getChaveAcessoNfse() {
        return this.getVo().asString("CHAVEACESSONFSE");
   }

   public void setChaveAcessoNfse(String chaveAcessoNfse) {
        markAsChanged("CHAVEACESSONFSE", chaveAcessoNfse);
   }

   public BigDecimal getCodLojaEconect() {
        return this.getVo().asBigDecimal("CODLOJAECONECT");
   }

   public void setCodLojaEconect(BigDecimal codLojaEconect) {
        markAsChanged("CODLOJAECONECT", codLojaEconect);
   }

   public BigDecimal getTopRecargaCelEconect() {
        return this.getVo().asBigDecimal("TOPRECARGACELECONECT");
   }

   public void setTopRecargaCelEconect(BigDecimal topRecargaCelEconect) {
        markAsChanged("TOPRECARGACELECONECT", topRecargaCelEconect);
   }

   public BigDecimal getTopNfceEconect() {
        return this.getVo().asBigDecimal("TOPNFCEECONECT");
   }

   public void setTopNfceEconect(BigDecimal topNfceEconect) {
        markAsChanged("TOPNFCEECONECT", topNfceEconect);
   }

   public BigDecimal getTopSatEconect() {
        return this.getVo().asBigDecimal("TOPSATECONECT");
   }

   public void setTopSatEconect(BigDecimal topSatEconect) {
        markAsChanged("TOPSATECONECT", topSatEconect);
   }

   public BigDecimal getWmsCodEndFlut() {
        return this.getVo().asBigDecimal("WMSCODENDFLUT");
   }

   public void setWmsCodEndFlut(BigDecimal wmsCodEndFlut) {
        markAsChanged("WMSCODENDFLUT", wmsCodEndFlut);
   }

   public String getUsaTrocoCheckout() {
        return this.getVo().asString("USATROCOCHECKOUT");
   }

   public void setUsaTrocoCheckout(String usaTrocoCheckout) {
        markAsChanged("USATROCOCHECKOUT", usaTrocoCheckout);
   }

   public BigDecimal getCodEmpOrigMovFin() {
        return this.getVo().asBigDecimal("CODEMPORIGMOVFIN");
   }

   public void setCodEmpOrigMovFin(BigDecimal codEmpOrigMovFin) {
        markAsChanged("CODEMPORIGMOVFIN", codEmpOrigMovFin);
   }

   public String getCalcVencGnreApu() {
        return this.getVo().asString("CALCVENCGNREAPU");
   }

   public void setCalcVencGnreApu(String calcVencGnreApu) {
        markAsChanged("CALCVENCGNREAPU", calcVencGnreApu);
   }

   public String getGerObsIpiRegEnt() {
        return this.getVo().asString("GEROBSIPIREGENT");
   }

   public void setGerObsIpiRegEnt(String gerObsIpiRegEnt) {
        markAsChanged("GEROBSIPIREGENT", gerObsIpiRegEnt);
   }

   public String getGerCteCredPisCof() {
        return this.getVo().asString("GERCTECREDPISCOF");
   }

   public void setGerCteCredPisCof(String gerCteCredPisCof) {
        markAsChanged("GERCTECREDPISCOF", gerCteCredPisCof);
   }

   public String getGer0220UndForn() {
        return this.getVo().asString("GER0220UNDFORN");
   }

   public void setGer0220UndForn(String ger0220UndForn) {
        markAsChanged("GER0220UNDFORN", ger0220UndForn);
   }

   public String getGerChaveRefSig() {
        return this.getVo().asString("GERCHAVEREFSIG");
   }

   public void setGerChaveRefSig(String gerChaveRefSig) {
        markAsChanged("GERCHAVEREFSIG", gerChaveRefSig);
   }

   public String getProibDigConfEnt() {
        return this.getVo().asString("PROIBDIGCONFENT");
   }

   public void setProibDigConfEnt(String proibDigConfEnt) {
        markAsChanged("PROIBDIGCONFENT", proibDigConfEnt);
   }

   public BigDecimal getQtdConfEntWms() {
        return this.getVo().asBigDecimal("QTDCONFENTWMS");
   }

   public void setQtdConfEntWms(BigDecimal qtdConfEntWms) {
        markAsChanged("QTDCONFENTWMS", qtdConfEntWms);
   }

   public String getEmpCentralMovFin() {
        return this.getVo().asString("EMPCENTRALMOVFIN");
   }

   public void setEmpCentralMovFin(String empCentralMovFin) {
        markAsChanged("EMPCENTRALMOVFIN", empCentralMovFin);
   }

   public BigDecimal getCodModEmailNfe() {
        return this.getVo().asBigDecimal("CODMODEMAILNFE");
   }

   public void setCodModEmailNfe(BigDecimal codModEmailNfe) {
        markAsChanged("CODMODEMAILNFE", codModEmailNfe);
   }

   public BigDecimal getCodModDanfeSimplifNfe() {
        return this.getVo().asBigDecimal("CODMODDANFESIMPLIFNFE");
   }

   public void setCodModDanfeSimplifNfe(BigDecimal codModDanfeSimplifNfe) {
        markAsChanged("CODMODDANFESIMPLIFNFE", codModDanfeSimplifNfe);
   }

   public String getGerCiapCompEfd() {
        return this.getVo().asString("GERCIAPCOMPEFD");
   }

   public void setGerCiapCompEfd(String gerCiapCompEfd) {
        markAsChanged("GERCIAPCOMPEFD", gerCiapCompEfd);
   }

   public BigDecimal getModEmailLibLim() {
        return this.getVo().asBigDecimal("MODEMAILLIBLIM");
   }

   public void setModEmailLibLim(BigDecimal modEmailLibLim) {
        markAsChanged("MODEMAILLIBLIM", modEmailLibLim);
   }

   public String getTokenNfse() {
        return this.getVo().asString("TOKENNFSE");
   }

   public void setTokenNfse(String tokenNfse) {
        markAsChanged("TOKENNFSE", tokenNfse);
   }

   public BigDecimal getEfdCodBco() {
        return this.getVo().asBigDecimal("EFDCODBCO");
   }

   public void setEfdCodBco(BigDecimal efdCodBco) {
        markAsChanged("EFDCODBCO", efdCodBco);
   }

   public BigDecimal getEfdCodCenCus() {
        return this.getVo().asBigDecimal("EFDCODCENCUS");
   }

   public void setEfdCodCenCus(BigDecimal efdCodCenCus) {
        markAsChanged("EFDCODCENCUS", efdCodCenCus);
   }

   public BigDecimal getEfdCodCtaBcoInt() {
        return this.getVo().asBigDecimal("EFDCODCTABCOINT");
   }

   public void setEfdCodCtaBcoInt(BigDecimal efdCodCtaBcoInt) {
        markAsChanged("EFDCODCTABCOINT", efdCodCtaBcoInt);
   }

   public BigDecimal getEfdCodNatDespRecIcms() {
        return this.getVo().asBigDecimal("EFDCODNATDESPRECICMS");
   }

   public void setEfdCodNatDespRecIcms(BigDecimal efdCodNatDespRecIcms) {
        markAsChanged("EFDCODNATDESPRECICMS", efdCodNatDespRecIcms);
   }

   public BigDecimal getEfdCodTipoPer() {
        return this.getVo().asBigDecimal("EFDCODTIPOPER");
   }

   public void setEfdCodTipoPer(BigDecimal efdCodTipoPer) {
        markAsChanged("EFDCODTIPOPER", efdCodTipoPer);
   }

   public BigDecimal getEfdCodTipTit() {
        return this.getVo().asBigDecimal("EFDCODTIPTIT");
   }

   public void setEfdCodTipTit(BigDecimal efdCodTipTit) {
        markAsChanged("EFDCODTIPTIT", efdCodTipTit);
   }

   public BigDecimal getEfdDiaVenc() {
        return this.getVo().asBigDecimal("EFDDIAVENC");
   }

   public void setEfdDiaVenc(BigDecimal efdDiaVenc) {
        markAsChanged("EFDDIAVENC", efdDiaVenc);
   }

   public String getEfdTipoReenchNota() {
        return this.getVo().asString("EFDTIPREENCHNOTA");
   }

   public void setEfdTipoReenchNota(String efdTipoReenchNota) {
        markAsChanged("EFDTIPREENCHNOTA", efdTipoReenchNota);
   }

   public String getIntFinObricmsStRec() {
        return this.getVo().asString("INTFINOBRICMSSTREC");
   }

   public void setIntFinObricmsStRec(String intFinObricmsStRec) {
        markAsChanged("INTFINOBRICMSSTREC", intFinObricmsStRec);
   }

   public String getWmsRastSerMed() {
        return this.getVo().asString("WMSRASTSERMED");
   }

   public void setWmsRastSerMed(String wmsRastSerMed) {
        markAsChanged("WMSRASTSERMED", wmsRastSerMed);
   }

   public String getCodRespRetC180() {
        return this.getVo().asString("CODRESPRETC180");
   }

   public void setCodRespRetC180(String codRespRetC180) {
        markAsChanged("CODRESPRETC180", codRespRetC180);
   }

   public String getVlrBaseStC180() {
        return this.getVo().asString("VLRBASESTC180");
   }

   public void setVlrBaseStC180(String vlrBaseStC180) {
        markAsChanged("VLRBASESTC180", vlrBaseStC180);
   }

   public String getVlrStC180() {
        return this.getVo().asString("VLRSTC180");
   }

   public void setVlrStC180(String vlrStC180) {
        markAsChanged("VLRSTC180", vlrStC180);
   }

   public BigDecimal getTopSangSupri() {
        return this.getVo().asBigDecimal("TOPSANGSUPRI");
   }

   public void setTopSangSupri(BigDecimal topSangSupri) {
        markAsChanged("TOPSANGSUPRI", topSangSupri);
   }

   public String getUsaVlrMedTransfEmp() {
        return this.getVo().asString("USAVLRMEDTRANSFEMP");
   }

   public void setUsaVlrMedTransfEmp(String usaVlrMedTransfEmp) {
        markAsChanged("USAVLRMEDTRANSFEMP", usaVlrMedTransfEmp);
   }

   public BigDecimal getTopDespesa() {
        return this.getVo().asBigDecimal("TOPDESPESA");
   }

   public void setTopDespesa(BigDecimal topDespesa) {
        markAsChanged("TOPDESPESA", topDespesa);
   }

   public String getUsaIndPresTopFat() {
        return this.getVo().asString("USAINDPRESTOPFAT");
   }

   public void setUsaIndPresTopFat(String usaIndPresTopFat) {
        markAsChanged("USAINDPRESTOPFAT", usaIndPresTopFat);
   }

   public String getTipoImpKitFox() {
        return this.getVo().asString("TIPOIMPKITFOX");
   }

   public void setTipoImpKitFox(String tipoImpKitFox) {
        markAsChanged("TIPOIMPKITFOX", tipoImpKitFox);
   }

   public String getApiKeyPixCheckout() {
        return this.getVo().asString("APIKEYPIXCHECKOUT");
   }

   public void setApiKeyPixCheckout(String apiKeyPixCheckout) {
        markAsChanged("APIKEYPIXCHECKOUT", apiKeyPixCheckout);
   }

   public BigDecimal getBancoPixCheckout() {
        return this.getVo().asBigDecimal("BANCOPIXCHECKOUT");
   }

   public void setBancoPixCheckout(BigDecimal bancoPixCheckout) {
        markAsChanged("BANCOPIXCHECKOUT", bancoPixCheckout);
   }

   public String getClientIdPixCheckout() {
        return this.getVo().asString("CLIENTIDPIXCHECKOUT");
   }

   public void setClientIdPixCheckout(String clientIdPixCheckout) {
        markAsChanged("CLIENTIDPIXCHECKOUT", clientIdPixCheckout);
   }

   public String getClientSecretPixCheckout() {
        return this.getVo().asString("CLIENTSECRETPIXCHECKOUT");
   }

   public void setClientSecretPixCheckout(String clientSecretPixCheckout) {
        markAsChanged("CLIENTSECRETPIXCHECKOUT", clientSecretPixCheckout);
   }

   public String getCstNRedIcmsBcPisCof() {
        return this.getVo().asString("CSTNREDICMSBCPISCOF");
   }

   public void setCstNRedIcmsBcPisCof(String cstNRedIcmsBcPisCof) {
        markAsChanged("CSTNREDICMSBCPISCOF", cstNRedIcmsBcPisCof);
   }

   public String getConsDevNfeReinf() {
        return this.getVo().asString("CONSDEVNFEREINF");
   }

   public void setConsDevNfeReinf(String consDevNfeReinf) {
        markAsChanged("CONSDEVNFEREINF", consDevNfeReinf);
   }

   public String getAmbienteGnre() {
        return this.getVo().asString("AMBIENTEGNRE");
   }

   public void setAmbienteGnre(String ambienteGnre) {
        markAsChanged("AMBIENTEGNRE", ambienteGnre);
   }

   public BigDecimal getCodEmpMatrizGnre() {
        return this.getVo().asBigDecimal("CODEMPMATRIZGNRE");
   }

   public void setCodEmpMatrizGnre(BigDecimal codEmpMatrizGnre) {
        markAsChanged("CODEMPMATRIZGNRE", codEmpMatrizGnre);
   }

   public String getVersaoGnre() {
        return this.getVo().asString("VERSAOGNRE");
   }

   public void setVersaoGnre(String versaoGnre) {
        markAsChanged("VERSAOGNRE", versaoGnre);
   }

   public BigDecimal getCodEmpGrupoFrete() {
        return this.getVo().asBigDecimal("CODEMPGRUPFRETE");
   }

   public void setCodEmpGrupoFrete(BigDecimal codEmpGrupoFrete) {
        markAsChanged("CODEMPGRUPFRETE", codEmpGrupoFrete);
   }

   public String getCalcFetHab() {
        return this.getVo().asString("CALCFETHAB");
   }

   public void setCalcFetHab(String calcFetHab) {
        markAsChanged("CALCFETHAB", calcFetHab);
   }

   public String getMsgInfAdicFetHab() {
        return this.getVo().asString("MSGINFADICFETHAB");
   }

   public void setMsgInfAdicFetHab(String msgInfAdicFetHab) {
        markAsChanged("MSGINFADICFETHAB", msgInfAdicFetHab);
   }

   public BigDecimal getAliqFuntTel() {
        return this.getVo().asBigDecimal("ALIQFUNTTEL");
   }

   public void setAliqFuntTel(BigDecimal aliqFuntTel) {
        markAsChanged("ALIQFUNTTEL", aliqFuntTel);
   }

   public BigDecimal getAliqFust() {
        return this.getVo().asBigDecimal("ALIQFUST");
   }

   public void setAliqFust(BigDecimal aliqFust) {
        markAsChanged("ALIQFUST", aliqFust);
   }

   public String getFisTel() {
        return this.getVo().asString("FISTEL");
   }

   public void setFisTel(String fisTel) {
        markAsChanged("FISTEL", fisTel);
   }

   public String getVlrIcmsOpAnt() {
        return this.getVo().asString("VLRICMSOPANT");
   }

   public void setVlrIcmsOpAnt(String vlrIcmsOpAnt) {
        markAsChanged("VLRICMSOPANT", vlrIcmsOpAnt);
   }

   public String getVlrStFcpOpAnt() {
        return this.getVo().asString("VLRSTFCPOPANT");
   }

   public void setVlrStFcpOpAnt(String vlrStFcpOpAnt) {
        markAsChanged("VLRSTFCPOPANT", vlrStFcpOpAnt);
   }

   public String getVlrStOpAnt() {
        return this.getVo().asString("VLRSTOPANT");
   }

   public void setVlrStOpAnt(String vlrStOpAnt) {
        markAsChanged("VLRSTOPANT", vlrStOpAnt);
   }

   public String getVlrUnitIcmsOp() {
        return this.getVo().asString("VLRUNITICMSOP");
   }

   public void setVlrUnitIcmsOp(String vlrUnitIcmsOp) {
        markAsChanged("VLRUNITICMSOP", vlrUnitIcmsOp);
   }

   public String getIniBereabMaxPicking() {
        return this.getVo().asString("INIBEREABMAXPICKING");
   }

   public void setIniBereabMaxPicking(String iniBereabMaxPicking) {
        markAsChanged("INIBEREABMAXPICKING", iniBereabMaxPicking);
   }

   public String getTratSobFinConf() {
        return this.getVo().asString("TRATSOBFINCONF");
   }

   public void setTratSobFinConf(String tratSobFinConf) {
        markAsChanged("TRATSOBFINCONF", tratSobFinConf);
   }

   public BigDecimal getConEstOrigProd() {
        return this.getVo().asBigDecimal("CONESTORIGPROD");
   }

   public void setConEstOrigProd(BigDecimal conEstOrigProd) {
        markAsChanged("CONESTORIGPROD", conEstOrigProd);
   }

   public String getVlrUnitMerc() {
        return this.getVo().asString("VLRUNITMERC");
   }

   public void setVlrUnitMerc(String vlrUnitMerc) {
        markAsChanged("VLRUNITMERC", vlrUnitMerc);
   }

   public String getRedDifAlBcPisCof() {
        return this.getVo().asString("REDDIFALBCPISCOF");
   }

   public void setRedDifAlBcPisCof(String redDifAlBcPisCof) {
        markAsChanged("REDDIFALBCPISCOF", redDifAlBcPisCof);
   }

   public String getEntAutTarMapa() {
        return this.getVo().asString("ENTAUTTARMAPA");
   }

   public void setEntAutTarMapa(String entAutTarMapa) {
        markAsChanged("ENTAUTTARMAPA", entAutTarMapa);
   }

   public BigDecimal getPriorCodNat() {
        return this.getVo().asBigDecimal("PRIORCODNAT");
   }

   public void setPriorCodNat(BigDecimal priorCodNat) {
        markAsChanged("PRIORCODNAT", priorCodNat);
   }

   public String getEnvRespContCte() {
        return this.getVo().asString("ENVRESPCONTCTE");
   }

   public void setEnvRespContCte(String envRespContCte) {
        markAsChanged("ENVRESPCONTCTE", envRespContCte);
   }

   public String getConsDevTerevTr2050() {
        return this.getVo().asString("CONSDEVTEREVTR2050");
   }

   public void setConsDevTerevTr2050(String consDevTerevTr2050) {
        markAsChanged("CONSDEVTEREVTR2050", consDevTerevTr2050);
   }

   public String getEnvInutNotaExc() {
        return this.getVo().asString("ENVINUTNOTAEXC");
   }

   public void setEnvInutNotaExc(String envInutNotaExc) {
        markAsChanged("ENVINUTNOTAEXC", envInutNotaExc);
   }

   public String getJusInutNotaExc() {
        return this.getVo().asString("JUSINUTNOTAEXC");
   }

   public void setJusInutNotaExc(String jusInutNotaExc) {
        markAsChanged("JUSINUTNOTAEXC", jusInutNotaExc);
   }

   public String getWmsDocArep() {
        return this.getVo().asString("WMSDOCAREP");
   }

   public void setWmsDocArep(String wmsDocArep) {
        markAsChanged("WMSDOCAREP", wmsDocArep);
   }

   public String getDeduzFcpBcPisCofins() {
        return this.getVo().asString("DEDUZFCPBCPISCOFINS");
   }

   public void setDeduzFcpBcPisCofins(String deduzFcpBcPisCofins) {
        markAsChanged("DEDUZFCPBCPISCOFINS", deduzFcpBcPisCofins);
   }

   public String getSepPulParcial() {
        return this.getVo().asString("SEPPULPARCIAL");
   }

   public void setSepPulParcial(String sepPulParcial) {
        markAsChanged("SEPPULPARCIAL", sepPulParcial);
   }

   public String getObtStAntMedEnt() {
        return this.getVo().asString("OBTSTANTMEDENT");
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        markAsChanged("OBTSTANTMEDENT", obtStAntMedEnt);
   }

   public String getCalcIcmsAt() {
        return this.getVo().asString("CALCICMSAT");
   }

   public void setCalcIcmsAt(String calcIcmsAt) {
        markAsChanged("CALCICMSAT", calcIcmsAt);
   }

   public String getProibEscCheckoutPed() {
        return this.getVo().asString("PROIBESCCHECKOUTPED");
   }

   public void setProibEscCheckoutPed(String proibEscCheckoutPed) {
        markAsChanged("PROIBESCCHECKOUTPED", proibEscCheckoutPed);
   }

   public String getNfeCanExtCanMes() {
        return this.getVo().asString("NFECANEXTCANMES");
   }

   public void setNfeCanExtCanMes(String nfeCanExtCanMes) {
        markAsChanged("NFECANEXTCANMES", nfeCanExtCanMes);
   }

   public String getEnvMdfSinc() {
        return this.getVo().asString("ENVMDFSINC");
   }

   public void setEnvMdfSinc(String envMdfSinc) {
        markAsChanged("ENVMDFSINC", envMdfSinc);
   }

   public String getWmsPersEpProdAp() {
        return this.getVo().asString("WMSPERSEPPRODAP");
   }

   public void setWmsPersEpProdAp(String wmsPersEpProdAp) {
        markAsChanged("WMSPERSEPPRODAP", wmsPersEpProdAp);
   }

   public String getConsidQtCarDesc() {
        return this.getVo().asString("CONSIDQTCARCDESC");
   }

   public void setConsidQtCarDesc(String considQtCarDesc) {
        markAsChanged("CONSIDQTCARCDESC", considQtCarDesc);
   }

   public String getEnvLeiTranspDesc() {
        return this.getVo().asString("ENVLEITRANSPDESC");
   }

   public void setEnvLeiTranspDesc(String envLeiTranspDesc) {
        markAsChanged("ENVLEITRANSPDESC", envLeiTranspDesc);
   }

   public String getEnvLeiTranspTotObs() {
        return this.getVo().asString("ENVLEITRANSPTOTOBS");
   }

   public void setEnvLeiTranspTotObs(String envLeiTranspTotObs) {
        markAsChanged("ENVLEITRANSPTOTOBS", envLeiTranspTotObs);
   }

   public String getCgcProcurador() {
        return this.getVo().asString("CGCPROCURADOR");
   }

   public void setCgcProcurador(String cgcProcurador) {
        markAsChanged("CGCPROCURADOR", cgcProcurador);
   }

   public String getIniBloqRegConf() {
        return this.getVo().asString("INIBLOQREGCONF");
   }

   public void setIniBloqRegConf(String iniBloqRegConf) {
        markAsChanged("INIBLOQREGCONF", iniBloqRegConf);
   }

   public String getBlqNfaCompNfcPend() {
        return this.getVo().asString("BLQNFACOMPNFCPEND");
   }

   public void setBlqNfaCompNfcPend(String blqNfaCompNfcPend) {
        markAsChanged("BLQNFACOMPNFCPEND", blqNfaCompNfcPend);
   }

   public String getDifAliqDespAcess() {
        return this.getVo().asString("DIFALIQDESPACESS");
   }

   public void setDifAliqDespAcess(String difAliqDespAcess) {
        markAsChanged("DIFALIQDESPACESS", difAliqDespAcess);
   }

   public String getComplRestituicaoIcmsSt() {
        return this.getVo().asString("COMPLRESTITUICAOICMSST");
   }

   public void setComplRestituicaoIcmsSt(String complRestituicaoIcmsSt) {
        markAsChanged("COMPLRESTITUICAOICMSST", complRestituicaoIcmsSt);
   }

   public String getCalcPisCfsFin() {
        return this.getVo().asString("CALCPISCFSFIN");
   }

   public void setCalcPisCfsFin(String calcPisCfsFin) {
        markAsChanged("CALCPISCFSFIN", calcPisCfsFin);
   }

   public String getIsAliqIntSexC() {
        return this.getVo().asString("ISALIQINTSEXC");
   }

   public void setIsAliqIntSexC(String isAliqIntSexC) {
        markAsChanged("ISALIQINTSEXC", isAliqIntSexC);
   }

   public BigDecimal getTipIcmsFenValBem() {
        return this.getVo().asBigDecimal("TIPICMSFENVALBEM");
   }

   public void setTipIcmsFenValBem(BigDecimal tipIcmsFenValBem) {
        markAsChanged("TIPICMSFENVALBEM", tipIcmsFenValBem);
   }

   public String getChavePixCheckout() {
        return this.getVo().asString("CHAVEPIXCHECKOUT");
   }

   public void setChavePixCheckout(String chavePixCheckout) {
        markAsChanged("CHAVEPIXCHECKOUT", chavePixCheckout);
   }

   public String getUrlPixCheckout() {
        return this.getVo().asString("URLPIXCHECKOUT");
   }

   public void setUrlPixCheckout(String urlPixCheckout) {
        markAsChanged("URLPIXCHECKOUT", urlPixCheckout);
   }

   public BigDecimal getCalcVlrAquisBem() {
        return this.getVo().asBigDecimal("CALCVLRAQUISBEM");
   }

   public void setCalcVlrAquisBem(BigDecimal calcVlrAquisBem) {
        markAsChanged("CALCVLRAQUISBEM", calcVlrAquisBem);
   }

   public String getIniBelote() {
        return this.getVo().asString("INIBELOTE");
   }

   public void setIniBelote(String iniBelote) {
        markAsChanged("INIBELOTE", iniBelote);
   }

   public String getContBaiBemSubImprec() {
        return this.getVo().asString("CONTBAIBEMSUBIMPREC");
   }

   public void setContBaiBemSubImprec(String contBaiBemSubImprec) {
        markAsChanged("CONTBAIBEMSUBIMPREC", contBaiBemSubImprec);
   }

   public BigDecimal getCodCtaPixTef() {
        return this.getVo().asBigDecimal("CODCTAPIXTEF");
   }

   public void setCodCtaPixTef(BigDecimal codCtaPixTef) {
        markAsChanged("CODCTAPIXTEF", codCtaPixTef);
   }

   public String getCredIcmsCombus() {
        return this.getVo().asString("CREDICMSCOMBUS");
   }

   public void setCredIcmsCombus(String credIcmsCombus) {
        markAsChanged("CREDICMSCOMBUS", credIcmsCombus);
   }

   public String getCredIcmsRemg() {
        return this.getVo().asString("CREDICMSREMG");
   }

   public void setCredIcmsRemg(String credIcmsRemg) {
        markAsChanged("CREDICMSREMG", credIcmsRemg);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getDescrNat() {
        return this.getVo().asString("DESCRNAT");
   }

   public void setDescrNat(String descrNat) {
        markAsChanged("DESCRNAT", descrNat);
   }

   public String getDesTipIdEvCom() {
        return this.getVo().asString("DESTIPIDEVCOM");
   }

   public void setDesTipIdEvCom(String desTipIdEvCom) {
        markAsChanged("DESTIPIDEVCOM", desTipIdEvCom);
   }

   public BigDecimal getNatCanPix() {
        return this.getVo().asBigDecimal("NATCANPIX");
   }

   public void setNatCanPix(BigDecimal natCanPix) {
        markAsChanged("NATCANPIX", natCanPix);
   }

   public String getRupturaEst() {
        return this.getVo().asString("RUPTURAEST");
   }

   public void setRupturaEst(String rupturaEst) {
        markAsChanged("RUPTURAEST", rupturaEst);
   }

   public String getSomarFcpBcCiap() {
        return this.getVo().asString("SOMARFCPBCCIAP");
   }

   public void setSomarFcpBcCiap(String somarFcpBcCiap) {
        markAsChanged("SOMARFCPBCCIAP", somarFcpBcCiap);
   }

   public String getTipoPix() {
        return this.getVo().asString("TIPOPIX");
   }

   public void setTipoPix(String tipoPix) {
        markAsChanged("TIPOPIX", tipoPix);
   }

   public BigDecimal getTopCanPixFin() {
        return this.getVo().asBigDecimal("TOPCANPIXFIN");
   }

   public void setTopCanPixFin(BigDecimal topCanPixFin) {
        markAsChanged("TOPCANPIXFIN", topCanPixFin);
   }

   public BigDecimal getTopCanPixPag() {
        return this.getVo().asBigDecimal("TOPCANPIXPAG");
   }

   public void setTopCanPixPag(BigDecimal topCanPixPag) {
        markAsChanged("TOPCANPIXPAG", topCanPixPag);
   }

   public BigDecimal getTopCanPixRec() {
        return this.getVo().asBigDecimal("TOPCANPIXREC");
   }

   public void setTopCanPixRec(BigDecimal topCanPixRec) {
        markAsChanged("TOPCANPIXREC", topCanPixRec);
   }

   public String getUsaMedDiaImp() {
        return this.getVo().asString("USAMEDDIAIMP");
   }

   public void setUsaMedDiaImp(String usaMedDiaImp) {
        markAsChanged("USAMEDDIAIMP", usaMedDiaImp);
   }

   public BigDecimal getCodCenCusIpi() {
        return this.getVo().asBigDecimal("CODCENCUSIPI");
   }

   public void setCodCenCusIpi(BigDecimal codCenCusIpi) {
        markAsChanged("CODCENCUSIPI", codCenCusIpi);
   }

   public BigDecimal getCodCtaBcoIpi() {
        return this.getVo().asBigDecimal("CODCTABCOIPI");
   }

   public void setCodCtaBcoIpi(BigDecimal codCtaBcoIpi) {
        markAsChanged("CODCTABCOIPI", codCtaBcoIpi);
   }

   public BigDecimal getCodEmpImposto() {
        return this.getVo().asBigDecimal("CODEMPIMPOSTO");
   }

   public void setCodEmpImposto(BigDecimal codEmpImposto) {
        markAsChanged("CODEMPIMPOSTO", codEmpImposto);
   }

   public BigDecimal getCodModRetEstWms() {
        return this.getVo().asBigDecimal("CODMODRETESTWMS");
   }

   public void setCodModRetEstWms(BigDecimal codModRetEstWms) {
        markAsChanged("CODMODRETESTWMS", codModRetEstWms);
   }

   public BigDecimal getCodNatIpi() {
        return this.getVo().asBigDecimal("CODNATIPI");
   }

   public void setCodNatIpi(BigDecimal codNatIpi) {
        markAsChanged("CODNATIPI", codNatIpi);
   }

   public BigDecimal getCodParCipi() {
        return this.getVo().asBigDecimal("CODPARCIPI");
   }

   public void setCodParCipi(BigDecimal codParCipi) {
        markAsChanged("CODPARCIPI", codParCipi);
   }

   public String getCodReceitaIpi() {
        return this.getVo().asString("CODRECEITAIPI");
   }

   public void setCodReceitaIpi(String codReceitaIpi) {
        markAsChanged("CODRECEITAIPI", codReceitaIpi);
   }

   public String getCodReceitaReinf() {
        return this.getVo().asString("CODRECEITAREINF");
   }

   public void setCodReceitaReinf(String codReceitaReinf) {
        markAsChanged("CODRECEITAREINF", codReceitaReinf);
   }

   public BigDecimal getCodTipoPerIpi() {
        return this.getVo().asBigDecimal("CODTIPOPERIPI");
   }

   public void setCodTipoPerIpi(BigDecimal codTipoPerIpi) {
        markAsChanged("CODTIPOPERIPI", codTipoPerIpi);
   }

   public BigDecimal getCodTipTitIpi() {
        return this.getVo().asBigDecimal("CODTIPTITIPI");
   }

   public void setCodTipTitIpi(BigDecimal codTipTitIpi) {
        markAsChanged("CODTIPTITIPI", codTipTitIpi);
   }

   public String getConsDifParCoutIcms() {
        return this.getVo().asString("CONSDIFPARCOUTICMS");
   }

   public void setConsDifParCoutIcms(String consDifParCoutIcms) {
        markAsChanged("CONSDIFPARCOUTICMS", consDifParCoutIcms);
   }

   public String getCtaCtbAnlRegApur() {
        return this.getVo().asString("CTACTBANLREGAPUR");
   }

   public void setCtaCtbAnlRegApur(String ctaCtbAnlRegApur) {
        markAsChanged("CTACTBANLREGAPUR", ctaCtbAnlRegApur);
   }

   public String getDesRestrFcpCst() {
        return this.getVo().asString("DESRESTRFCPCST");
   }

   public void setDesRestrFcpCst(String desRestrFcpCst) {
        markAsChanged("DESRESTRFCPCST", desRestrFcpCst);
   }

   public String getDesRestrFcpStCst() {
        return this.getVo().asString("DESRESTRFCPSTCST");
   }

   public void setDesRestrFcpStCst(String desRestrFcpStCst) {
        markAsChanged("DESRESTRFCPSTCST", desRestrFcpStCst);
   }

   public BigDecimal getDiaVencIpi() {
        return this.getVo().asBigDecimal("DIAVENCIPI");
   }

   public void setDiaVencIpi(BigDecimal diaVencIpi) {
        markAsChanged("DIAVENCIPI", diaVencIpi);
   }

   public Timestamp getDtObito() {
        return this.getVo().asTimestamp("DTOBITO");
   }

   public void setDtObito(Timestamp dtObito) {
        markAsChanged("DTOBITO", dtObito);
   }

   public String getDtOpJuros() {
        return this.getVo().asString("DTOPJUROS");
   }

   public void setDtOpJuros(String dtOpJuros) {
        markAsChanged("DTOPJUROS", dtOpJuros);
   }

   public String getDtOpMulta() {
        return this.getVo().asString("DTOPMULTA");
   }

   public void setDtOpMulta(String dtOpMulta) {
        markAsChanged("DTOPMULTA", dtOpMulta);
   }

   public Timestamp getDtRefPreProdReaisReinfG4000() {
        return this.getVo().asTimestamp("DTREFPREPRODREAISREINFG4000");
   }

   public void setDtRefPreProdReaisReinfG4000(Timestamp dtRefPreProdReaisReinfG4000) {
        markAsChanged("DTREFPREPRODREAISREINFG4000", dtRefPreProdReaisReinfG4000);
   }

   public Timestamp getDtRefProdReinfG4000() {
        return this.getVo().asTimestamp("DTREFPRODREINFG4000");
   }

   public void setDtRefProdReinfG4000(Timestamp dtRefProdReinfG4000) {
        markAsChanged("DTREFPRODREINFG4000", dtRefProdReinfG4000);
   }

   public Timestamp getDtTransfFinsLucr() {
        return this.getVo().asTimestamp("DTTRANSFFINSLUCR");
   }

   public void setDtTransfFinsLucr(Timestamp dtTransfFinsLucr) {
        markAsChanged("DTTRANSFFINSLUCR", dtTransfFinsLucr);
   }

   public String getEnvInfIssSomDevido() {
        return this.getVo().asString("ENVINFISSSOMDEVIDO");
   }

   public void setEnvInfIssSomDevido(String envInfIssSomDevido) {
        markAsChanged("ENVINFISSSOMDEVIDO", envInfIssSomDevido);
   }

   public String getEstrNcredIcmsSt() {
        return this.getVo().asString("ESTRNCREDICMSST");
   }

   public void setEstrNcredIcmsSt(String estrNcredIcmsSt) {
        markAsChanged("ESTRNCREDICMSST", estrNcredIcmsSt);
   }

   public String getGerMultPlacRes() {
        return this.getVo().asString("GERMULTPLACRES");
   }

   public void setGerMultPlacRes(String gerMultPlacRes) {
        markAsChanged("GERMULTPLACRES", gerMultPlacRes);
   }

   public BigDecimal getIndTipoLayoutK010() {
        return this.getVo().asBigDecimal("INDTIPLAYOUTK010");
   }

   public void setIndTipoLayoutK010(BigDecimal indTipoLayoutK010) {
        markAsChanged("INDTIPLAYOUTK010", indTipoLayoutK010);
   }

   public BigDecimal getIndUniao() {
        return this.getVo().asBigDecimal("INDUNIAO");
   }

   public void setIndUniao(BigDecimal indUniao) {
        markAsChanged("INDUNIAO", indUniao);
   }

   public String getIntegrarIpiFin() {
        return this.getVo().asString("INTEGRARIPIFIN");
   }

   public void setIntegrarIpiFin(String integrarIpiFin) {
        markAsChanged("INTEGRARIPIFIN", integrarIpiFin);
   }

   public BigDecimal getModEstCpaWms() {
        return this.getVo().asBigDecimal("MODESTCPAWMS");
   }

   public void setModEstCpaWms(BigDecimal modEstCpaWms) {
        markAsChanged("MODESTCPAWMS", modEstCpaWms);
   }

   public BigDecimal getNotaEntAjusteReclas() {
        return this.getVo().asBigDecimal("NOTAENTAJUSTERECLAS");
   }

   public void setNotaEntAjusteReclas(BigDecimal notaEntAjusteReclas) {
        markAsChanged("NOTAENTAJUSTERECLAS", notaEntAjusteReclas);
   }

   public BigDecimal getNotaSaiAjusteReclas() {
        return this.getVo().asBigDecimal("NOTASAIAJUSTERECLAS");
   }

   public void setNotaSaiAjusteReclas(BigDecimal notaSaiAjusteReclas) {
        markAsChanged("NOTASAIAJUSTERECLAS", notaSaiAjusteReclas);
   }

   public BigDecimal getOrigDescontos() {
        return this.getVo().asBigDecimal("ORIGDESCONTOS");
   }

   public void setOrigDescontos(BigDecimal origDescontos) {
        markAsChanged("ORIGDESCONTOS", origDescontos);
   }

   public String getRedStBcPisCofins() {
        return this.getVo().asString("REDSTBCPISCOFINS");
   }

   public void setRedStBcPisCofins(String redStBcPisCofins) {
        markAsChanged("REDSTBCPISCOFINS", redStBcPisCofins);
   }

   public String getStInclusA70() {
        return this.getVo().asString("STINCLUSA70");
   }

   public void setStInclusA70(String stInclusA70) {
        markAsChanged("STINCLUSA70", stInclusA70);
   }

   public String getTipCtaCtbEfdF() {
        return this.getVo().asString("TIPCTACTBEFDF");
   }

   public void setTipCtaCtbEfdF(String tipCtaCtbEfdF) {
        markAsChanged("TIPCTACTBEFDF", tipCtaCtbEfdF);
   }

   public String getTipDataEvtPag() {
        return this.getVo().asString("TIPDATAEVTPAG");
   }

   public void setTipDataEvtPag(String tipDataEvtPag) {
        markAsChanged("TIPDATAEVTPAG", tipDataEvtPag);
   }

   public String getTipDataEvtPagXir() {
        return this.getVo().asString("TIPDATAEVTPAGXIR");
   }

   public void setTipDataEvtPagXir(String tipDataEvtPagXir) {
        markAsChanged("TIPDATAEVTPAGXIR", tipDataEvtPagXir);
   }

   public String getTokenIbpt() {
        return this.getVo().asString("TOKENIBPT");
   }

   public void setTokenIbpt(String tokenIbpt) {
        markAsChanged("TOKENIBPT", tokenIbpt);
   }

   public String getUsaCusMedIcmsPro() {
        return this.getVo().asString("USACUSMEDICMPRO");
   }

   public void setUsaCusMedIcmsPro(String usaCusMedIcmsPro) {
        markAsChanged("USACUSMEDICMPRO", usaCusMedIcmsPro);
   }

   public String getUsaCustoMedioMps() {
        return this.getVo().asString("USACUSTOMEDIOMPS");
   }

   public void setUsaCustoMedioMps(String usaCustoMedioMps) {
        markAsChanged("USACUSTOMEDIOMPS", usaCustoMedioMps);
   }

   public String getDesApCProDepE() {
        return this.getVo().asString("DESAPCPRODEPE");
   }

   public void setDesApCProDepE(String desApCProDepE) {
        markAsChanged("DESAPCPRODEPE", desApCProDepE);
   }

   public String getRegApurTribSn() {
        return this.getVo().asString("REGAPURTRIBSN");
   }

   public void setRegApurTribSn(String regApurTribSn) {
        markAsChanged("REGAPURTRIBSN", regApurTribSn);
   }

   public BigDecimal getStatus() {
        return this.getVo().asBigDecimal("STATUS");
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
   }

   public String getGeraDeducaoPf() {
        return this.getVo().asString("GERADEDUCAOPF");
   }

   public void setGeraDeducaoPf(String geraDeducaoPf) {
        markAsChanged("GERADEDUCAOPF", geraDeducaoPf);
   }

   public String getCredIcmsCst60Am() {
        return this.getVo().asString("CREDICMSCST60AM");
   }

   public void setCredIcmsCst60Am(String credIcmsCst60Am) {
        markAsChanged("CREDICMSCST60AM", credIcmsCst60Am);
   }

   public String getDenuncEspCte() {
        return this.getVo().asString("DENUNCESPCTE");
   }

   public void setDenuncEspCte(String denuncEspCte) {
        markAsChanged("DENUNCESPCTE", denuncEspCte);
   }

   public BigDecimal getPrazoRCancCte() {
        return this.getVo().asBigDecimal("PRAZORCANCCTE");
   }

   public void setPrazoRCancCte(BigDecimal prazoRCancCte) {
        markAsChanged("PRAZORCANCCTE", prazoRCancCte);
   }

   public BigDecimal getPrazoTCancCte() {
        return this.getVo().asBigDecimal("PRAZOTCANCCTE");
   }

   public void setPrazoTCancCte(BigDecimal prazoTCancCte) {
        markAsChanged("PRAZOTCANCCTE", prazoTCancCte);
   }

   public String getTerAcpCte() {
        return this.getVo().asString("TERACPCTE");
   }

   public void setTerAcpCte(String terAcpCte) {
        markAsChanged("TERACPCTE", terAcpCte);
   }

   public String getAplCalcDifAliqFrt() {
        return this.getVo().asString("APLCALCDIFALIQFRT");
   }

   public void setAplCalcDifAliqFrt(String aplCalcDifAliqFrt) {
        markAsChanged("APLCALCDIFALIQFRT", aplCalcDifAliqFrt);
   }

   @Override
   public String getTableName() {
        return "TGFEMP";
   }

   @Override
   public String getEntityName() {
        return "EmpresaFinanceiro";
   }

   @Override
   public EmpresaFinanceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
