package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ListaMateriaisAtividade extends AbstractSankhyaEntity<ListaMateriaisAtividade> {
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
   private String consuRefUgo;
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
        markAsChanged("CODLOCALBAIXA", codLocalBaixa);
        this.codLocalBaixa = codLocalBaixa;
   }

   public BigDecimal getPercDesvioInf() {
        return percDesvioInf;
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        markAsChanged("PERCDESVIOINF", percDesvioInf);
        this.percDesvioInf = percDesvioInf;
   }

   public BigDecimal getPercDesvioSup() {
        return percDesvioSup;
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        markAsChanged("PERCDESVIOSUP", percDesvioSup);
        this.percDesvioSup = percDesvioSup;
   }

   public String getTipoControleMp() {
        return tipoControleMp;
   }

   public void setTipoControleMp(String tipoControleMp) {
        markAsChanged("TIPOCONTROLEMP", tipoControleMp);
        this.tipoControleMp = tipoControleMp;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public String getGeraRequisicao() {
        return geraRequisicao;
   }

   public void setGeraRequisicao(String geraRequisicao) {
        markAsChanged("GERAREQUISICAO", geraRequisicao);
        this.geraRequisicao = geraRequisicao;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getSeqMp() {
        return seqMp;
   }

   public void setSeqMp(BigDecimal seqMp) {
        markAsChanged("SEQMP", seqMp);
        this.seqMp = seqMp;
   }

   public String getTipoUsoMp() {
        return tipoUsoMp;
   }

   public void setTipoUsoMp(String tipoUsoMp) {
        markAsChanged("TIPOUSOMP", tipoUsoMp);
        this.tipoUsoMp = tipoUsoMp;
   }

   public String getVerificaEst() {
        return verificaEst;
   }

   public void setVerificaEst(String verificaEst) {
        markAsChanged("VERIFICAEST", verificaEst);
        this.verificaEst = verificaEst;
   }

   public String getTipoQtd() {
        return tipoQtd;
   }

   public void setTipoQtd(String tipoQtd) {
        markAsChanged("TIPOQTD", tipoQtd);
        this.tipoQtd = tipoQtd;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getFixaQtdApo() {
        return fixaQtdApo;
   }

   public void setFixaQtdApo(String fixaQtdApo) {
        markAsChanged("FIXAQTDAPO", fixaQtdApo);
        this.fixaQtdApo = fixaQtdApo;
   }

   public String getConsuRefUgo() {
        return consuRefUgo;
   }

   public void setConsuRefUgo(String consuRefUgo) {
        markAsChanged("CONSUREFUGO", consuRefUgo);
        this.consuRefUgo = consuRefUgo;
   }

   public String getVinculoSeriePa() {
        return vinculoSeriePa;
   }

   public void setVinculoSeriePa(String vinculoSeriePa) {
        markAsChanged("VINCULOSERIEPA", vinculoSeriePa);
        this.vinculoSeriePa = vinculoSeriePa;
   }

   public String getEstoqueTerceiro() {
        return estoqueTerceiro;
   }

   public void setEstoqueTerceiro(String estoqueTerceiro) {
        markAsChanged("ESTOQUETERCEIRO", estoqueTerceiro);
        this.estoqueTerceiro = estoqueTerceiro;
   }

   public String getLiberaDesvio() {
        return liberaDesvio;
   }

   public void setLiberaDesvio(String liberaDesvio) {
        markAsChanged("LIBERADESVIO", liberaDesvio);
        this.liberaDesvio = liberaDesvio;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
        this.dhCad = dhCad;
   }

   public String getPropMpFixa() {
        return propMpFixa;
   }

   public void setPropMpFixa(String propMpFixa) {
        markAsChanged("PROPMPFIXA", propMpFixa);
        this.propMpFixa = propMpFixa;
   }

   @Override
   public String getTableName() {
        return "TPRLMP";
   }

   @Override
   public String getEntityName() {
        return "ListaMateriaisAtividade";
   }

   @Override
   public ListaMateriaisAtividade fromVO(DynamicVO vo) {
        this.setVo(vo);
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
        this.consuRefUgo = vo.asString("CONSUREFUGO");
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
