package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoLivroFiscal extends AbstractSankhyaEntity<MovimentoLivroFiscal> {
   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public String getEmpParc() {
        return this.getVo().asString("EMPPARC");
   }

   public void setEmpParc(String empParc) {
        markAsChanged("EMPPARC", empParc);
   }

   public String getEntSai() {
        return this.getVo().asString("ENTSAI");
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
   }

   public String getEspDoc() {
        return this.getVo().asString("ESPDOC");
   }

   public void setEspDoc(String espDoc) {
        markAsChanged("ESPDOC", espDoc);
   }

   public BigDecimal getGtoTecf() {
        return this.getVo().asBigDecimal("GTOTECF");
   }

   public void setGtoTecf(BigDecimal gtoTecf) {
        markAsChanged("GTOTECF", gtoTecf);
   }

   public BigDecimal getIcmsRetencao() {
        return this.getVo().asBigDecimal("ICMSRETENCAO");
   }

   public void setIcmsRetencao(BigDecimal icmsRetencao) {
        markAsChanged("ICMSRETENCAO", icmsRetencao);
   }

   public BigDecimal getIsentasIcms() {
        return this.getVo().asBigDecimal("ISENTASICMS");
   }

   public void setIsentasIcms(BigDecimal isentasIcms) {
        markAsChanged("ISENTASICMS", isentasIcms);
   }

   public BigDecimal getIsentasIpi() {
        return this.getVo().asBigDecimal("ISENTASIPI");
   }

   public void setIsentasIpi(BigDecimal isentasIpi) {
        markAsChanged("ISENTASIPI", isentasIpi);
   }

   public BigDecimal getNumLanc() {
        return this.getVo().asBigDecimal("NUMLANC");
   }

   public void setNumLanc(BigDecimal numLanc) {
        markAsChanged("NUMLANC", numLanc);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNumNota2() {
        return this.getVo().asBigDecimal("NUMNOTA2");
   }

   public void setNumNota2(BigDecimal numNota2) {
        markAsChanged("NUMNOTA2", numNota2);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public BigDecimal getOutrasIcms() {
        return this.getVo().asBigDecimal("OUTRASICMS");
   }

   public void setOutrasIcms(BigDecimal outrasIcms) {
        markAsChanged("OUTRASICMS", outrasIcms);
   }

   public BigDecimal getOutrasIpi() {
        return this.getVo().asBigDecimal("OUTRASIPI");
   }

   public void setOutrasIpi(BigDecimal outrasIpi) {
        markAsChanged("OUTRASIPI", outrasIpi);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public String getTipIcms() {
        return this.getVo().asString("TIPICMS");
   }

   public void setTipIcms(String tipIcms) {
        markAsChanged("TIPICMS", tipIcms);
   }

   public String getTipIpi() {
        return this.getVo().asString("TIPIPI");
   }

   public void setTipIpi(String tipIpi) {
        markAsChanged("TIPIPI", tipIpi);
   }

   public String getUfDestino() {
        return this.getVo().asString("UFDESTINO");
   }

   public void setUfDestino(String ufDestino) {
        markAsChanged("UFDESTINO", ufDestino);
   }

   public String getUfOrigem() {
        return this.getVo().asString("UFORIGEM");
   }

   public void setUfOrigem(String ufOrigem) {
        markAsChanged("UFORIGEM", ufOrigem);
   }

   public BigDecimal getVlrCtb() {
        return this.getVo().asBigDecimal("VLRCTB");
   }

   public void setVlrCtb(BigDecimal vlrCtb) {
        markAsChanged("VLRCTB", vlrCtb);
   }

   public BigDecimal getVlrCtbTare() {
        return this.getVo().asBigDecimal("VLRCTBTARE");
   }

   public void setVlrCtbTare(BigDecimal vlrCtbTare) {
        markAsChanged("VLRCTBTARE", vlrCtbTare);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrIcmsTare() {
        return this.getVo().asBigDecimal("VLRICMSTARE");
   }

   public void setVlrIcmsTare(BigDecimal vlrIcmsTare) {
        markAsChanged("VLRICMSTARE", vlrIcmsTare);
   }

   public BigDecimal getVlrIpi() {
        return this.getVo().asBigDecimal("VLRIPI");
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
   }

   public BigDecimal getVlrTare() {
        return this.getVo().asBigDecimal("VLRTARE");
   }

   public void setVlrTare(BigDecimal vlrTare) {
        markAsChanged("VLRTARE", vlrTare);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTrib() {
        return this.getVo().asBigDecimal("CODTRIB");
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
   }

   public Timestamp getDhMov() {
        return this.getVo().asTimestamp("DHMOV");
   }

   public void setDhMov(Timestamp dhMov) {
        markAsChanged("DHMOV", dhMov);
   }

   public BigDecimal getDifIcms() {
        return this.getVo().asBigDecimal("DIFICMS");
   }

   public void setDifIcms(BigDecimal difIcms) {
        markAsChanged("DIFICMS", difIcms);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtDoc() {
        return this.getVo().asTimestamp("DTDOC");
   }

   public void setDtDoc(Timestamp dtDoc) {
        markAsChanged("DTDOC", dtDoc);
   }

   public String getChaveCte() {
        return this.getVo().asString("CHAVECTE");
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
   }

   public String getChaveCteRef() {
        return this.getVo().asString("CHAVECTEREF");
   }

   public void setChaveCteRef(String chaveCteRef) {
        markAsChanged("CHAVECTEREF", chaveCteRef);
   }

   public String getChaveNfe() {
        return this.getVo().asString("CHAVENFE");
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
   }

   public String getCodAntecipSt() {
        return this.getVo().asString("CODANTECIPST");
   }

   public void setCodAntecipSt(String codAntecipSt) {
        markAsChanged("CODANTECIPST", codAntecipSt);
   }

   public BigDecimal getCodCfo() {
        return this.getVo().asBigDecimal("CODCFO");
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAliqIpi() {
        return this.getVo().asBigDecimal("ALIQIPI");
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public BigDecimal getBaseIcmsTare() {
        return this.getVo().asBigDecimal("BASEICMSTARE");
   }

   public void setBaseIcmsTare(BigDecimal baseIcmsTare) {
        markAsChanged("BASEICMSTARE", baseIcmsTare);
   }

   public BigDecimal getBaseIpi() {
        return this.getVo().asBigDecimal("BASEIPI");
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        markAsChanged("BASEIPI", baseIpi);
   }

   public BigDecimal getBaseRetencao() {
        return this.getVo().asBigDecimal("BASERETENCAO");
   }

   public void setBaseRetencao(BigDecimal baseRetencao) {
        markAsChanged("BASERETENCAO", baseRetencao);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public BigDecimal getBaseRetencaoSemRed() {
        return this.getVo().asBigDecimal("BASERETENCAOSEMRED");
   }

   public void setBaseRetencaoSemRed(BigDecimal baseRetencaoSemRed) {
        markAsChanged("BASERETENCAOSEMRED", baseRetencaoSemRed);
   }

   public Timestamp getDtFilt() {
        return this.getVo().asTimestamp("DTFILT");
   }

   public void setDtFilt(Timestamp dtFilt) {
        markAsChanged("DTFILT", dtFilt);
   }

   public Timestamp getDtEntSaiInfo() {
        return this.getVo().asTimestamp("DTENTSAIINFO");
   }

   public void setDtEntSaiInfo(Timestamp dtEntSaiInfo) {
        markAsChanged("DTENTSAIINFO", dtEntSaiInfo);
   }

   public BigDecimal getVlrIcmsCompl() {
        return this.getVo().asBigDecimal("VLRICMSCOMPL");
   }

   public void setVlrIcmsCompl(BigDecimal vlrIcmsCompl) {
        markAsChanged("VLRICMSCOMPL", vlrIcmsCompl);
   }

   public String getUfEntrega() {
        return this.getVo().asString("UFENTREGA");
   }

   public void setUfEntrega(String ufEntrega) {
        markAsChanged("UFENTREGA", ufEntrega);
   }

   public BigDecimal getCodContatoEntrega() {
        return this.getVo().asBigDecimal("CODCONTATOENTREGA");
   }

   public void setCodContatoEntrega(BigDecimal codContatoEntrega) {
        markAsChanged("CODCONTATOENTREGA", codContatoEntrega);
   }

   public BigDecimal getCodCidFimCte() {
        return this.getVo().asBigDecimal("CODCIDFIMCTE");
   }

   public void setCodCidFimCte(BigDecimal codCidFimCte) {
        markAsChanged("CODCIDFIMCTE", codCidFimCte);
   }

   public BigDecimal getCodCidIniCte() {
        return this.getVo().asBigDecimal("CODCIDINICTE");
   }

   public void setCodCidIniCte(BigDecimal codCidIniCte) {
        markAsChanged("CODCIDINICTE", codCidIniCte);
   }

   public BigDecimal getVlrIcmsDifalRem() {
        return this.getVo().asBigDecimal("VLRICMSDIFALREM");
   }

   public void setVlrIcmsDifalRem(BigDecimal vlrIcmsDifalRem) {
        markAsChanged("VLRICMSDIFALREM", vlrIcmsDifalRem);
   }

   public BigDecimal getVlrIcmsFcp() {
        return this.getVo().asBigDecimal("VLRICMSFCP");
   }

   public void setVlrIcmsFcp(BigDecimal vlrIcmsFcp) {
        markAsChanged("VLRICMSFCP", vlrIcmsFcp);
   }

   public BigDecimal getVlrStFcpInt() {
        return this.getVo().asBigDecimal("VLRSTFCPINT");
   }

   public void setVlrStFcpInt(BigDecimal vlrStFcpInt) {
        markAsChanged("VLRSTFCPINT", vlrStFcpInt);
   }

   public BigDecimal getVlrIcmsFcpInt() {
        return this.getVo().asBigDecimal("VLRICMSFCPINT");
   }

   public void setVlrIcmsFcpInt(BigDecimal vlrIcmsFcpInt) {
        markAsChanged("VLRICMSFCPINT", vlrIcmsFcpInt);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getVlrIcmsDifalDest() {
        return this.getVo().asBigDecimal("VLRICMSDIFALDEST");
   }

   public void setVlrIcmsDifalDest(BigDecimal vlrIcmsDifalDest) {
        markAsChanged("VLRICMSDIFALDEST", vlrIcmsDifalDest);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getDescrEmpParc() {
        return this.getVo().asString("DESCR_EMP_PARC");
   }

   public void setDescrEmpParc(String descrEmpParc) {
        markAsChanged("DESCR_EMP_PARC", descrEmpParc);
   }

   public Timestamp getDtCanc() {
        return this.getVo().asTimestamp("DTCANC");
   }

   public void setDtCanc(Timestamp dtCanc) {
        markAsChanged("DTCANC", dtCanc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   @Override
   public String getTableName() {
        return "TGFLIV";
   }

   @Override
   public String getEntityName() {
        return "MovimentoLivroFiscal";
   }

   @Override
   public MovimentoLivroFiscal fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
