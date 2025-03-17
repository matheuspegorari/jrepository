package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ListaMateriaisAtividade implements SankhyaEntity<ListaMateriaisAtividade> {

   private BigDecimal codLocalBaixa;
   private BigDecimal percDesvioInf;
   private BigDecimal percDesvioSup;
   private String tipoControleMp;
   private BigDecimal codLocalOrig;
   private BigDecimal codProdMp;
   private BigDecimal codProdPa;
   private String codVol;
   private String controleMp;
   private String controlePa;
   private String geraRequisicao;
   private BigDecimal ideFx;
   private BigDecimal qtdMistura;
   private BigDecimal seqMp;
   private String tipoUsoMp;
   private String verificaEst;
   private String tipoQtd;
   private String referencia;
   private String fixaQtdApo;
   private String consuRefugo;
   private String vinculoSeriePa;
   private String estoqueTerceiro;
   private String liberaDesvio;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;
   private String propMpFixa;

   public BigDecimal getCodLocalBaixa() {
        return codLocalBaixa;
   }

   public void setCodLocalBaixa(BigDecimal codLocalBaixa) {
        this.codLocalBaixa = codLocalBaixa;
   }

   public BigDecimal getPercDesvioInf() {
        return percDesvioInf;
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        this.percDesvioInf = percDesvioInf;
   }

   public BigDecimal getPercDesvioSup() {
        return percDesvioSup;
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        this.percDesvioSup = percDesvioSup;
   }

   public String getTipoControleMp() {
        return tipoControleMp;
   }

   public void setTipoControleMp(String tipoControleMp) {
        this.tipoControleMp = tipoControleMp;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        this.codProdMp = codProdMp;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        this.controleMp = controleMp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public String getGeraRequisicao() {
        return geraRequisicao;
   }

   public void setGeraRequisicao(String geraRequisicao) {
        this.geraRequisicao = geraRequisicao;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getSeqMp() {
        return seqMp;
   }

   public void setSeqMp(BigDecimal seqMp) {
        this.seqMp = seqMp;
   }

   public String getTipoUsoMp() {
        return tipoUsoMp;
   }

   public void setTipoUsoMp(String tipoUsoMp) {
        this.tipoUsoMp = tipoUsoMp;
   }

   public String getVerificaEst() {
        return verificaEst;
   }

   public void setVerificaEst(String verificaEst) {
        this.verificaEst = verificaEst;
   }

   public String getTipoQtd() {
        return tipoQtd;
   }

   public void setTipoQtd(String tipoQtd) {
        this.tipoQtd = tipoQtd;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getFixaQtdApo() {
        return fixaQtdApo;
   }

   public void setFixaQtdApo(String fixaQtdApo) {
        this.fixaQtdApo = fixaQtdApo;
   }

   public String getConsuRefugo() {
        return consuRefugo;
   }

   public void setConsuRefugo(String consuRefugo) {
        this.consuRefugo = consuRefugo;
   }

   public String getVinculoSeriePa() {
        return vinculoSeriePa;
   }

   public void setVinculoSeriePa(String vinculoSeriePa) {
        this.vinculoSeriePa = vinculoSeriePa;
   }

   public String getEstoqueTerceiro() {
        return estoqueTerceiro;
   }

   public void setEstoqueTerceiro(String estoqueTerceiro) {
        this.estoqueTerceiro = estoqueTerceiro;
   }

   public String getLiberaDesvio() {
        return liberaDesvio;
   }

   public void setLiberaDesvio(String liberaDesvio) {
        this.liberaDesvio = liberaDesvio;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        this.dhCad = dhCad;
   }

   public String getPropMpFixa() {
        return propMpFixa;
   }

   public void setPropMpFixa(String propMpFixa) {
        this.propMpFixa = propMpFixa;
   }

   @Override
   public String getEntityName() {
        return "ListaMateriaisAtividade";
   }

   @Override
   public ListaMateriaisAtividade fromVO(DynamicVO vo) {
        this.codLocalBaixa = vo.asBigDecimal("CODLOCALBAIXA");
        this.percDesvioInf = vo.asBigDecimal("PERCDESVIOINF");
        this.percDesvioSup = vo.asBigDecimal("PERCDESVIOSUP");
        this.tipoControleMp = vo.asString("TIPOCONTROLEMP");
        this.codLocalOrig = vo.asBigDecimal("CODLOCALORIG");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codVol = vo.asString("CODVOL");
        this.controleMp = vo.asString("CONTROLEMP");
        this.controlePa = vo.asString("CONTROLEPA");
        this.geraRequisicao = vo.asString("GERAREQUISICAO");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.seqMp = vo.asBigDecimal("SEQMP");
        this.tipoUsoMp = vo.asString("TIPOUSOMP");
        this.verificaEst = vo.asString("VERIFICAEST");
        this.tipoQtd = vo.asString("TIPOQTD");
        this.referencia = vo.asString("REFERENCIA");
        this.fixaQtdApo = vo.asString("FIXAQTDAPO");
        this.consuRefugo = vo.asString("CONSUREFUGO");
        this.vinculoSeriePa = vo.asString("VINCULOSERIEPA");
        this.estoqueTerceiro = vo.asString("ESTOQUETERCEIRO");
        this.liberaDesvio = vo.asString("LIBERADESVIO");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        this.propMpFixa = vo.asString("PROPMPFIXA");
        return this;
   }
}
