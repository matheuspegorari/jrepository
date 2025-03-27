package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Contrato extends AbstractSankhyaEntity<Contrato> {
   public String getTemIrf() {
        return this.getVo().asString("TEMIRF");
   }

   public void setTemIrf(String temIrf) {
        markAsChanged("TEMIRF", temIrf);
   }

   public String getTemIss() {
        return this.getVo().asString("TEMISS");
   }

   public void setTemIss(String temIss) {
        markAsChanged("TEMISS", temIss);
   }

   public String getTemMed() {
        return this.getVo().asString("TEMMED");
   }

   public void setTemMed(String temMed) {
        markAsChanged("TEMMED", temMed);
   }

   public BigDecimal getQtdGerarPrev() {
        return this.getVo().asBigDecimal("QTDGERARPREV");
   }

   public void setQtdGerarPrev(BigDecimal qtdGerarPrev) {
        markAsChanged("QTDGERARPREV", qtdGerarPrev);
   }

   public BigDecimal getQtdParcPgCom() {
        return this.getVo().asBigDecimal("QTDPARCPGCOM");
   }

   public void setQtdParcPgCom(BigDecimal qtdParcPgCom) {
        markAsChanged("QTDPARCPGCOM", qtdParcPgCom);
   }

   public BigDecimal getQtdPrev() {
        return this.getVo().asBigDecimal("QTDPREV");
   }

   public void setQtdPrev(BigDecimal qtdPrev) {
        markAsChanged("QTDPREV", qtdPrev);
   }

   public BigDecimal getRecDesp() {
        return this.getVo().asBigDecimal("RECDESP");
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getRetEmiss() {
        return this.getVo().asString("RETEMISS");
   }

   public void setRetEmiss(String retEmiss) {
        markAsChanged("RETEMISS", retEmiss);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getAcessaHistSubos() {
        return this.getVo().asString("ACESSAHISTSUBOS");
   }

   public void setAcessaHistSubos(String acessaHistSubos) {
        markAsChanged("ACESSAHISTSUBOS", acessaHistSubos);
   }

   public String getAmbiente() {
        return this.getVo().asString("AMBIENTE");
   }

   public void setAmbiente(String ambiente) {
        markAsChanged("AMBIENTE", ambiente);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getClausContrato() {
        return this.getVo().asString("CLAUSCONTRATO");
   }

   public void setClausContrato(String clausContrato) {
        markAsChanged("CLAUSCONTRATO", clausContrato);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodCriterio() {
        return this.getVo().asBigDecimal("CODCRITERIO");
   }

   public void setCodCriterio(BigDecimal codCriterio) {
        markAsChanged("CODCRITERIO", codCriterio);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodImplant() {
        return this.getVo().asBigDecimal("CODIMPLANT");
   }

   public void setCodImplant(BigDecimal codImplant) {
        markAsChanged("CODIMPLANT", codImplant);
   }

   public BigDecimal getCodMoeAltReaj() {
        return this.getVo().asBigDecimal("CODMOEALTREAJ");
   }

   public void setCodMoeAltReaj(BigDecimal codMoeAltReaj) {
        markAsChanged("CODMOEALTREAJ", codMoeAltReaj);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodMonSankhya() {
        return this.getVo().asBigDecimal("CODMONSANKHYA");
   }

   public void setCodMonSankhya(BigDecimal codMonSankhya) {
        markAsChanged("CODMONSANKHYA", codMonSankhya);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcPrest() {
        return this.getVo().asBigDecimal("CODPARCPREST");
   }

   public void setCodParcPrest(BigDecimal codParcPrest) {
        markAsChanged("CODPARCPREST", codParcPrest);
   }

   public BigDecimal getCodParcSec() {
        return this.getVo().asBigDecimal("CODPARCSEC");
   }

   public void setCodParcSec(BigDecimal codParcSec) {
        markAsChanged("CODPARCSEC", codParcSec);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodProjSint() {
        return this.getVo().asBigDecimal("CODPROJSINT");
   }

   public void setCodProjSint(BigDecimal codProjSint) {
        markAsChanged("CODPROJSINT", codProjSint);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getColorFatForaSeq() {
        return this.getVo().asString("COLORFATFORASEQ");
   }

   public void setColorFatForaSeq(String colorFatForaSeq) {
        markAsChanged("COLORFATFORASEQ", colorFatForaSeq);
   }

   public BigDecimal getContCompleto() {
        return this.getVo().asBigDecimal("CONTCOMPLETO");
   }

   public void setContCompleto(BigDecimal contCompleto) {
        markAsChanged("CONTCOMPLETO", contCompleto);
   }

   public BigDecimal getContDesInstal() {
        return this.getVo().asBigDecimal("CONTDESINSTAL");
   }

   public void setContDesInstal(BigDecimal contDesInstal) {
        markAsChanged("CONTDESINSTAL", contDesInstal);
   }

   public BigDecimal getContInstal() {
        return this.getVo().asBigDecimal("CONTINSTAL");
   }

   public void setContInstal(BigDecimal contInstal) {
        markAsChanged("CONTINSTAL", contInstal);
   }

   public BigDecimal getDiaFimMed() {
        return this.getVo().asBigDecimal("DIAFIMMED");
   }

   public void setDiaFimMed(BigDecimal diaFimMed) {
        markAsChanged("DIAFIMMED", diaFimMed);
   }

   public BigDecimal getDiaPag() {
        return this.getVo().asBigDecimal("DIAPAG");
   }

   public void setDiaPag(BigDecimal diaPag) {
        markAsChanged("DIAPAG", diaPag);
   }

   public String getDiaUtil() {
        return this.getVo().asString("DIAUTIL");
   }

   public void setDiaUtil(String diaUtil) {
        markAsChanged("DIAUTIL", diaUtil);
   }

   public Timestamp getDtBaseReaj() {
        return this.getVo().asTimestamp("DTBASEREAJ");
   }

   public void setDtBaseReaj(Timestamp dtBaseReaj) {
        markAsChanged("DTBASEREAJ", dtBaseReaj);
   }

   public Timestamp getDtContrato() {
        return this.getVo().asTimestamp("DTCONTRATO");
   }

   public void setDtContrato(Timestamp dtContrato) {
        markAsChanged("DTCONTRATO", dtContrato);
   }

   public Timestamp getDtEnvioEmail() {
        return this.getVo().asTimestamp("DTENVIOEMAIL");
   }

   public void setDtEnvioEmail(Timestamp dtEnvioEmail) {
        markAsChanged("DTENVIOEMAIL", dtEnvioEmail);
   }

   public Timestamp getDtRefProxFat() {
        return this.getVo().asTimestamp("DTREFPROXFAT");
   }

   public void setDtRefProxFat(Timestamp dtRefProxFat) {
        markAsChanged("DTREFPROXFAT", dtRefProxFat);
   }

   public Timestamp getDtRefUltFat() {
        return this.getVo().asTimestamp("DTREFULTFAT");
   }

   public void setDtRefUltFat(Timestamp dtRefUltFat) {
        markAsChanged("DTREFULTFAT", dtRefUltFat);
   }

   public Timestamp getDtTermino() {
        return this.getVo().asTimestamp("DTTERMINO");
   }

   public void setDtTermino(Timestamp dtTermino) {
        markAsChanged("DTTERMINO", dtTermino);
   }

   public Timestamp getDtVencto() {
        return this.getVo().asTimestamp("DTVENCTO");
   }

   public void setDtVencto(Timestamp dtVencto) {
        markAsChanged("DTVENCTO", dtVencto);
   }

   public BigDecimal getDuracao() {
        return this.getVo().asBigDecimal("DURACAO");
   }

   public void setDuracao(BigDecimal duracao) {
        markAsChanged("DURACAO", duracao);
   }

   public String getEquipamento() {
        return this.getVo().asString("EQUIPAMENTO");
   }

   public void setEquipamento(String equipamento) {
        markAsChanged("EQUIPAMENTO", equipamento);
   }

   public String getFeriadoEst() {
        return this.getVo().asString("FERIADOEST");
   }

   public void setFeriadoEst(String feriadoEst) {
        markAsChanged("FERIADOEST", feriadoEst);
   }

   public String getFeriadoMun() {
        return this.getVo().asString("FERIADOMUN");
   }

   public void setFeriadoMun(String feriadoMun) {
        markAsChanged("FERIADOMUN", feriadoMun);
   }

   public String getFeriadoNac() {
        return this.getVo().asString("FERIADONAC");
   }

   public void setFeriadoNac(String feriadoNac) {
        markAsChanged("FERIADONAC", feriadoNac);
   }

   public BigDecimal getFreqReaj() {
        return this.getVo().asBigDecimal("FREQREAJ");
   }

   public void setFreqReaj(BigDecimal freqReaj) {
        markAsChanged("FREQREAJ", freqReaj);
   }

   public BigDecimal getFreqVisitas() {
        return this.getVo().asBigDecimal("FREQVISITAS");
   }

   public void setFreqVisitas(BigDecimal freqVisitas) {
        markAsChanged("FREQVISITAS", freqVisitas);
   }

   public BigDecimal getGatilho() {
        return this.getVo().asBigDecimal("GATILHO");
   }

   public void setGatilho(BigDecimal gatilho) {
        markAsChanged("GATILHO", gatilho);
   }

   public String getGerarNf() {
        return this.getVo().asString("GERARNF");
   }

   public void setGerarNf(String gerarNf) {
        markAsChanged("GERARNF", gerarNf);
   }

   public String getImprime() {
        return this.getVo().asString("IMPRIME");
   }

   public void setImprime(String imprime) {
        markAsChanged("IMPRIME", imprime);
   }

   public String getImprPrecIndiv() {
        return this.getVo().asString("IMPRPRECINDIV");
   }

   public void setImprPrecIndiv(String imprPrecIndiv) {
        markAsChanged("IMPRPRECINDIV", imprPrecIndiv);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumContratoOrigem() {
        return this.getVo().asBigDecimal("NUMCONTRATOORIGEM");
   }

   public void setNumContratoOrigem(BigDecimal numContratoOrigem) {
        markAsChanged("NUMCONTRATOORIGEM", numContratoOrigem);
   }

   public BigDecimal getNuNotaPedLoc() {
        return this.getVo().asBigDecimal("NUNOTAPEDLOC");
   }

   public void setNuNotaPedLoc(BigDecimal nuNotaPedLoc) {
        markAsChanged("NUNOTAPEDLOC", nuNotaPedLoc);
   }

   public BigDecimal getNuSla() {
        return this.getVo().asBigDecimal("NUSLA");
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
   }

   public String getObservacoes() {
        return this.getVo().asString("OBSERVACOES");
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
   }

   public BigDecimal getParcelaAtual() {
        return this.getVo().asBigDecimal("PARCELAATUAL");
   }

   public void setParcelaAtual(BigDecimal parcelaAtual) {
        markAsChanged("PARCELAATUAL", parcelaAtual);
   }

   public BigDecimal getParcelaFat() {
        return this.getVo().asBigDecimal("PARCELAFAT");
   }

   public void setParcelaFat(BigDecimal parcelaFat) {
        markAsChanged("PARCELAFAT", parcelaFat);
   }

   public BigDecimal getParcelaQtd() {
        return this.getVo().asBigDecimal("PARCELAQTD");
   }

   public void setParcelaQtd(BigDecimal parcelaQtd) {
        markAsChanged("PARCELAQTD", parcelaQtd);
   }

   public BigDecimal getPercIrf() {
        return this.getVo().asBigDecimal("PERCIRF");
   }

   public void setPercIrf(BigDecimal percIrf) {
        markAsChanged("PERCIRF", percIrf);
   }

   public BigDecimal getPercIss() {
        return this.getVo().asBigDecimal("PERCISS");
   }

   public void setPercIss(BigDecimal percIss) {
        markAsChanged("PERCISS", percIss);
   }

   public BigDecimal getPercLoc() {
        return this.getVo().asBigDecimal("PERCLOC");
   }

   public void setPercLoc(BigDecimal percLoc) {
        markAsChanged("PERCLOC", percLoc);
   }

   public BigDecimal getPrazoVencto() {
        return this.getVo().asBigDecimal("PRAZOVENCTO");
   }

   public void setPrazoVencto(BigDecimal prazoVencto) {
        markAsChanged("PRAZOVENCTO", prazoVencto);
   }

   public BigDecimal getQtdFinPend() {
        return this.getVo().asBigDecimal("QTDFINPEND");
   }

   public void setQtdFinPend(BigDecimal qtdFinPend) {
        markAsChanged("QTDFINPEND", qtdFinPend);
   }

   public BigDecimal getVlrFinPend() {
        return this.getVo().asBigDecimal("VLRFINPEND");
   }

   public void setVlrFinPend(BigDecimal vlrFinPend) {
        markAsChanged("VLRFINPEND", vlrFinPend);
   }

   public BigDecimal getVlrOriginal() {
        return this.getVo().asBigDecimal("VLRORIGINAL");
   }

   public void setVlrOriginal(BigDecimal vlrOriginal) {
        markAsChanged("VLRORIGINAL", vlrOriginal);
   }

   public BigDecimal getVlrServicos() {
        return this.getVo().asBigDecimal("VLRSERVICOS");
   }

   public void setVlrServicos(BigDecimal vlrServicos) {
        markAsChanged("VLRSERVICOS", vlrServicos);
   }

   public BigDecimal getVlrTotal() {
        return this.getVo().asBigDecimal("VLRTOTAL");
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        markAsChanged("VLRTOTAL", vlrTotal);
   }

   public String getTipoContrato() {
        return this.getVo().asString("TIPOCONTRATO");
   }

   public void setTipoContrato(String tipoContrato) {
        markAsChanged("TIPOCONTRATO", tipoContrato);
   }

   public BigDecimal getTipoTitulo() {
        return this.getVo().asBigDecimal("TIPOTITULO");
   }

   public void setTipoTitulo(BigDecimal tipoTitulo) {
        markAsChanged("TIPOTITULO", tipoTitulo);
   }

   public String getTipPag() {
        return this.getVo().asString("TIPPAG");
   }

   public void setTipPag(String tipPag) {
        markAsChanged("TIPPAG", tipPag);
   }

   public BigDecimal getTotalContrato() {
        return this.getVo().asBigDecimal("TOTALCONTRATO");
   }

   public void setTotalContrato(BigDecimal totalContrato) {
        markAsChanged("TOTALCONTRATO", totalContrato);
   }

   public BigDecimal getTotalFaturado() {
        return this.getVo().asBigDecimal("TOTALFATURADO");
   }

   public void setTotalFaturado(BigDecimal totalFaturado) {
        markAsChanged("TOTALFATURADO", totalFaturado);
   }

   public BigDecimal getTotalProvPendente() {
        return this.getVo().asBigDecimal("TOTALPROVPENDENTE");
   }

   public void setTotalProvPendente(BigDecimal totalProvPendente) {
        markAsChanged("TOTALPROVPENDENTE", totalProvPendente);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public String getContrOrgPublico() {
        return this.getVo().asString("CONTRORGPUBLICO");
   }

   public void setContrOrgPublico(String contrOrgPublico) {
        markAsChanged("CONTRORGPUBLICO", contrOrgPublico);
   }

   public String getFaturProrata() {
        return this.getVo().asString("FATURPRORATA");
   }

   public void setFaturProrata(String faturProrata) {
        markAsChanged("FATURPRORATA", faturProrata);
   }

   public String getGrupoFaturProrata() {
        return this.getVo().asString("GRUPOFATURPRORATA");
   }

   public void setGrupoFaturProrata(String grupoFaturProrata) {
        markAsChanged("GRUPOFATURPRORATA", grupoFaturProrata);
   }

   public String getSerFaturCon() {
        return this.getVo().asString("SERFATURCON");
   }

   public void setSerFaturCon(String serFaturCon) {
        markAsChanged("SERFATURCON", serFaturCon);
   }

   public BigDecimal getTopFaturCon() {
        return this.getVo().asBigDecimal("TOPFATURCON");
   }

   public void setTopFaturCon(BigDecimal topFaturCon) {
        markAsChanged("TOPFATURCON", topFaturCon);
   }

   public String getControlocBens() {
        return this.getVo().asString("CONTROLOCBENS");
   }

   public void setControlocBens(String controlocBens) {
        markAsChanged("CONTROLOCBENS", controlocBens);
   }

   public BigDecimal getQtdProvisao() {
        return this.getVo().asBigDecimal("QTDPROVISAO");
   }

   public void setQtdProvisao(BigDecimal qtdProvisao) {
        markAsChanged("QTDPROVISAO", qtdProvisao);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public String getReajusteNegativo() {
        return this.getVo().asString("REAJUSTENEGATIVO");
   }

   public void setReajusteNegativo(String reajusteNegativo) {
        markAsChanged("REAJUSTENEGATIVO", reajusteNegativo);
   }

   public String getLocacaoBem() {
        return this.getVo().asString("LOCACAOBEM");
   }

   public void setLocacaoBem(String locacaoBem) {
        markAsChanged("LOCACAOBEM", locacaoBem);
   }

   public String getGerarFinNota() {
        return this.getVo().asString("GERARFINNOTA");
   }

   public void setGerarFinNota(String gerarFinNota) {
        markAsChanged("GERARFINNOTA", gerarFinNota);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public String getTemCrIratEsp() {
        return this.getVo().asString("TEMCRIRATESP");
   }

   public void setTemCrIratEsp(String temCrIratEsp) {
        markAsChanged("TEMCRIRATESP", temCrIratEsp);
   }

   public BigDecimal getCodServEx() {
        return this.getVo().asBigDecimal("CODSERVEX");
   }

   public void setCodServEx(BigDecimal codServEx) {
        markAsChanged("CODSERVEX", codServEx);
   }

   public String getNumContIn() {
        return this.getVo().asString("NUMCONTIN");
   }

   public void setNumContIn(String numContIn) {
        markAsChanged("NUMCONTIN", numContIn);
   }

   public String getCobPropOrCar() {
        return this.getVo().asString("COBPROPORCAR");
   }

   public void setCobPropOrCar(String cobPropOrCar) {
        markAsChanged("COBPROPORCAR", cobPropOrCar);
   }

   public BigDecimal getCodCencusAr() {
        return this.getVo().asBigDecimal("CODCENCUSAR");
   }

   public void setCodCencusAr(BigDecimal codCencusAr) {
        markAsChanged("CODCENCUSAR", codCencusAr);
   }

   public BigDecimal getCodCencusEx() {
        return this.getVo().asBigDecimal("CODCENCUSEX");
   }

   public void setCodCencusEx(BigDecimal codCencusEx) {
        markAsChanged("CODCENCUSEX", codCencusEx);
   }

   public BigDecimal getCodNatAr() {
        return this.getVo().asBigDecimal("CODNATAR");
   }

   public void setCodNatAr(BigDecimal codNatAr) {
        markAsChanged("CODNATAR", codNatAr);
   }

   public BigDecimal getCodNatEx() {
        return this.getVo().asBigDecimal("CODNATEX");
   }

   public void setCodNatEx(BigDecimal codNatEx) {
        markAsChanged("CODNATEX", codNatEx);
   }

   public BigDecimal getCodSaf() {
        return this.getVo().asBigDecimal("CODSAF");
   }

   public void setCodSaf(BigDecimal codSaf) {
        markAsChanged("CODSAF", codSaf);
   }

   public BigDecimal getCodTipVendaAr() {
        return this.getVo().asBigDecimal("CODTIPVENDAAR");
   }

   public void setCodTipVendaAr(BigDecimal codTipVendaAr) {
        markAsChanged("CODTIPVENDAAR", codTipVendaAr);
   }

   public BigDecimal getCodTipVendaEx() {
        return this.getVo().asBigDecimal("CODTIPVENDAEX");
   }

   public void setCodTipVendaEx(BigDecimal codTipVendaEx) {
        markAsChanged("CODTIPVENDAEX", codTipVendaEx);
   }

   public String getDefTipA() {
        return this.getVo().asString("DEFTIPA");
   }

   public void setDefTipA(String defTipA) {
        markAsChanged("DEFTIPA", defTipA);
   }

   public BigDecimal getDiaCareCar() {
        return this.getVo().asBigDecimal("DIACARECAR");
   }

   public void setDiaCareCar(BigDecimal diaCareCar) {
        markAsChanged("DIACARECAR", diaCareCar);
   }

   public BigDecimal getDiaCarenc() {
        return this.getVo().asBigDecimal("DIACARENC");
   }

   public void setDiaCarenc(BigDecimal diaCarenc) {
        markAsChanged("DIACARENC", diaCarenc);
   }

   public BigDecimal getDiaCarencEx() {
        return this.getVo().asBigDecimal("DIACARENCEX");
   }

   public void setDiaCarencEx(BigDecimal diaCarencEx) {
        markAsChanged("DIACARENCEX", diaCarencEx);
   }

   public BigDecimal getPadClass() {
        return this.getVo().asBigDecimal("PADCLASS");
   }

   public void setPadClass(BigDecimal padClass) {
        markAsChanged("PADCLASS", padClass);
   }

   public String getPercObra() {
        return this.getVo().asString("PERCOBRA");
   }

   public void setPercObra(String percObra) {
        markAsChanged("PERCOBRA", percObra);
   }

   public String getPercObraAr() {
        return this.getVo().asString("PERCOBRAAR");
   }

   public void setPercObraAr(String percObraAr) {
        markAsChanged("PERCOBRAAR", percObraAr);
   }

   public String getPercDesc() {
        return this.getVo().asString("PERDESC");
   }

   public void setPercDesc(String percDesc) {
        markAsChanged("PERDESC", percDesc);
   }

   public String getPercDescon() {
        return this.getVo().asString("PERDESCON");
   }

   public void setPercDescon(String percDescon) {
        markAsChanged("PERDESCON", percDescon);
   }

   public BigDecimal getQuebraTec() {
        return this.getVo().asBigDecimal("QUEBRATEC");
   }

   public void setQuebraTec(BigDecimal quebraTec) {
        markAsChanged("QUEBRATEC", quebraTec);
   }

   public BigDecimal getRespPagar() {
        return this.getVo().asBigDecimal("RESPPAGAR");
   }

   public void setRespPagar(BigDecimal respPagar) {
        markAsChanged("RESPPAGAR", respPagar);
   }

   public String getSitCont() {
        return this.getVo().asString("SITCONT");
   }

   public void setSitCont(String sitCont) {
        markAsChanged("SITCONT", sitCont);
   }

   public BigDecimal getTabPrecUmi() {
        return this.getVo().asBigDecimal("TABPRECUMI");
   }

   public void setTabPrecUmi(BigDecimal tabPrecUmi) {
        markAsChanged("TABPRECUMI", tabPrecUmi);
   }

   public BigDecimal getTabPrecUmiAr() {
        return this.getVo().asBigDecimal("TABPRECUMIAR");
   }

   public void setTabPrecUmiAr(BigDecimal tabPrecUmiAr) {
        markAsChanged("TABPRECUMIAR", tabPrecUmiAr);
   }

   public String getTipCobr() {
        return this.getVo().asString("TIPCOBR");
   }

   public void setTipCobr(String tipCobr) {
        markAsChanged("TIPCOBR", tipCobr);
   }

   public String getTipoArm() {
        return this.getVo().asString("TIPOARM");
   }

   public void setTipoArm(String tipoArm) {
        markAsChanged("TIPOARM", tipoArm);
   }

   public BigDecimal getTipoTituloAr() {
        return this.getVo().asBigDecimal("TIPOTITULOAR");
   }

   public void setTipoTituloAr(BigDecimal tipoTituloAr) {
        markAsChanged("TIPOTITULOAR", tipoTituloAr);
   }

   public BigDecimal getTipoTituloEx() {
        return this.getVo().asBigDecimal("TIPOTITULOEX");
   }

   public void setTipoTituloEx(BigDecimal tipoTituloEx) {
        markAsChanged("TIPOTITULOEX", tipoTituloEx);
   }

   public String getTipQuebra() {
        return this.getVo().asString("TIPQUEBRA");
   }

   public void setTipQuebra(String tipQuebra) {
        markAsChanged("TIPQUEBRA", tipQuebra);
   }

   public String getUltTabUmi() {
        return this.getVo().asString("ULTTABUMI");
   }

   public void setUltTabUmi(String ultTabUmi) {
        markAsChanged("ULTTABUMI", ultTabUmi);
   }

   public BigDecimal getUmiDpadra() {
        return this.getVo().asBigDecimal("UMIDPADRA");
   }

   public void setUmiDpadra(BigDecimal umiDpadra) {
        markAsChanged("UMIDPADRA", umiDpadra);
   }

   public BigDecimal getUniConvSc() {
        return this.getVo().asBigDecimal("UNICONVSC");
   }

   public void setUniConvSc(BigDecimal uniConvSc) {
        markAsChanged("UNICONVSC", uniConvSc);
   }

   public String getValPedFin() {
        return this.getVo().asString("VALPEDFIN");
   }

   public void setValPedFin(String valPedFin) {
        markAsChanged("VALPEDFIN", valPedFin);
   }

   public String getCobProQue() {
        return this.getVo().asString("COBPROQUE");
   }

   public void setCobProQue(String cobProQue) {
        markAsChanged("COBPROQUE", cobProQue);
   }

   public BigDecimal getCodObs() {
        return this.getVo().asBigDecimal("CODOBS");
   }

   public void setCodObs(BigDecimal codObs) {
        markAsChanged("CODOBS", codObs);
   }

   public String getDiaFixo() {
        return this.getVo().asString("DIAFIXO");
   }

   public void setDiaFixo(String diaFixo) {
        markAsChanged("DIAFIXO", diaFixo);
   }

   public BigDecimal getPrazoMensal() {
        return this.getVo().asBigDecimal("PRAZOMENSAL");
   }

   public void setPrazoMensal(BigDecimal prazoMensal) {
        markAsChanged("PRAZOMENSAL", prazoMensal);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getTipIsencao() {
        return this.getVo().asString("TIPISENCAO");
   }

   public void setTipIsencao(String tipIsencao) {
        markAsChanged("TIPISENCAO", tipIsencao);
   }

   public BigDecimal getCodClc() {
        return this.getVo().asBigDecimal("CODCLC");
   }

   public void setCodClc(BigDecimal codClc) {
        markAsChanged("CODCLC", codClc);
   }

   public BigDecimal getNuNotaRefArmaze() {
        return this.getVo().asBigDecimal("NUNOTAREFARMAZE");
   }

   public void setNuNotaRefArmaze(BigDecimal nuNotaRefArmaze) {
        markAsChanged("NUNOTAREFARMAZE", nuNotaRefArmaze);
   }

   public BigDecimal getNuNotaRefExpRec() {
        return this.getVo().asBigDecimal("NUNOTAREFEXPREC");
   }

   public void setNuNotaRefExpRec(BigDecimal nuNotaRefExpRec) {
        markAsChanged("NUNOTAREFEXPREC", nuNotaRefExpRec);
   }

   public BigDecimal getNumCstc() {
        return this.getVo().asBigDecimal("NUMCSTC");
   }

   public void setNumCstc(BigDecimal numCstc) {
        markAsChanged("NUMCSTC", numCstc);
   }

   public Timestamp getDtRefArmaze() {
        return this.getVo().asTimestamp("DTREFARMAZE");
   }

   public void setDtRefArmaze(Timestamp dtRefArmaze) {
        markAsChanged("DTREFARMAZE", dtRefArmaze);
   }

   public Timestamp getDtRefExpRec() {
        return this.getVo().asTimestamp("DTREFEXPREC");
   }

   public void setDtRefExpRec(Timestamp dtRefExpRec) {
        markAsChanged("DTREFEXPREC", dtRefExpRec);
   }

   public String getFormFatArmaze() {
        return this.getVo().asString("FORMFATARMAZE");
   }

   public void setFormFatArmaze(String formFatArmaze) {
        markAsChanged("FORMFATARMAZE", formFatArmaze);
   }

   public String getFormFatExpRec() {
        return this.getVo().asString("FORMFATEXPREC");
   }

   public void setFormFatExpRec(String formFatExpRec) {
        markAsChanged("FORMFATEXPREC", formFatExpRec);
   }

   public BigDecimal getValQuebTrans() {
        return this.getVo().asBigDecimal("VALQUEBTRANS");
   }

   public void setValQuebTrans(BigDecimal valQuebTrans) {
        markAsChanged("VALQUEBTRANS", valQuebTrans);
   }

   public String getCifFob() {
        return this.getVo().asString("CIF_FOB");
   }

   public void setCifFob(String cifFob) {
        markAsChanged("CIF_FOB", cifFob);
   }

   public String getEndereco() {
        return this.getVo().asString("ENDERECO");
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
   }

   public String getInscEst() {
        return this.getVo().asString("INSCEST");
   }

   public void setInscEst(String inscEst) {
        markAsChanged("INSCEST", inscEst);
   }

   public String getNomeParc() {
        return this.getVo().asString("NOMEPARC");
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
   }

   public BigDecimal getQtdePrevista() {
        return this.getVo().asBigDecimal("QTDEPREVISTA");
   }

   public void setQtdePrevista(BigDecimal qtdePrevista) {
        markAsChanged("QTDEPREVISTA", qtdePrevista);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDtFinEntrega() {
        return this.getVo().asTimestamp("DTFINENTREGA");
   }

   public void setDtFinEntrega(Timestamp dtFinEntrega) {
        markAsChanged("DTFINENTREGA", dtFinEntrega);
   }

   public Timestamp getDtIniEntrega() {
        return this.getVo().asTimestamp("DTINIENTREGA");
   }

   public void setDtIniEntrega(Timestamp dtIniEntrega) {
        markAsChanged("DTINIENTREGA", dtIniEntrega);
   }

   public String getExigePedidoPes() {
        return this.getVo().asString("EXIGEPEDIDOPES");
   }

   public void setExigePedidoPes(String exigePedidoPes) {
        markAsChanged("EXIGEPEDIDOPES", exigePedidoPes);
   }

   public String getModalidade() {
        return this.getVo().asString("MODALIDADE");
   }

   public void setModalidade(String modalidade) {
        markAsChanged("MODALIDADE", modalidade);
   }

   public BigDecimal getPercTolExced() {
        return this.getVo().asBigDecimal("PERCTOLEXCED");
   }

   public void setPercTolExced(BigDecimal percTolExced) {
        markAsChanged("PERCTOLEXCED", percTolExced);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public String getTipCon() {
        return this.getVo().asString("TIPCON");
   }

   public void setTipCon(String tipCon) {
        markAsChanged("TIPCON", tipCon);
   }

   public BigDecimal getTotNeg() {
        return this.getVo().asBigDecimal("TOTNEG");
   }

   public void setTotNeg(BigDecimal totNeg) {
        markAsChanged("TOTNEG", totNeg);
   }

   public BigDecimal getValNegSc() {
        return this.getVo().asBigDecimal("VALNEGSC");
   }

   public void setValNegSc(BigDecimal valNegSc) {
        markAsChanged("VALNEGSC", valNegSc);
   }

   public String getRegLaudSaida() {
        return this.getVo().asString("REGLAUDSAIDA");
   }

   public void setRegLaudSaida(String regLaudSaida) {
        markAsChanged("REGLAUDSAIDA", regLaudSaida);
   }

   public String getGrupo() {
        return this.getVo().asString("GRUPO");
   }

   public void setGrupo(String grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public BigDecimal getPpAutAsc() {
        return this.getVo().asBigDecimal("PPAUTASC");
   }

   public void setPpAutAsc(BigDecimal ppAutAsc) {
        markAsChanged("PPAUTASC", ppAutAsc);
   }

   @Override
   public String getTableName() {
        return "TCSCON";
   }

   @Override
   public String getEntityName() {
        return "Contrato";
   }

   @Override
   public Contrato fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
