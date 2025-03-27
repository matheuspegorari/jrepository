package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ListaMateriaisAtividade extends AbstractSankhyaEntity<ListaMateriaisAtividade> {
   public BigDecimal getCodLocalBaixa() {
        return this.getVo().asBigDecimal("CODLOCALBAIXA");
   }

   public void setCodLocalBaixa(BigDecimal codLocalBaixa) {
        markAsChanged("CODLOCALBAIXA", codLocalBaixa);
   }

   public BigDecimal getPercDesvioInf() {
        return this.getVo().asBigDecimal("PERCDESVIOINF");
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        markAsChanged("PERCDESVIOINF", percDesvioInf);
   }

   public BigDecimal getPercDesvioSup() {
        return this.getVo().asBigDecimal("PERCDESVIOSUP");
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        markAsChanged("PERCDESVIOSUP", percDesvioSup);
   }

   public String getTipoControleMp() {
        return this.getVo().asString("TIPOCONTROLEMP");
   }

   public void setTipoControleMp(String tipoControleMp) {
        markAsChanged("TIPOCONTROLEMP", tipoControleMp);
   }

   public BigDecimal getCodLocalOrig() {
        return this.getVo().asBigDecimal("CODLOCALORIG");
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getGeraRequisicao() {
        return this.getVo().asString("GERAREQUISICAO");
   }

   public void setGeraRequisicao(String geraRequisicao) {
        markAsChanged("GERAREQUISICAO", geraRequisicao);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getQtdMistura() {
        return this.getVo().asBigDecimal("QTDMISTURA");
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
   }

   public BigDecimal getSeqMp() {
        return this.getVo().asBigDecimal("SEQMP");
   }

   public void setSeqMp(BigDecimal seqMp) {
        markAsChanged("SEQMP", seqMp);
   }

   public String getTipoUsoMp() {
        return this.getVo().asString("TIPOUSOMP");
   }

   public void setTipoUsoMp(String tipoUsoMp) {
        markAsChanged("TIPOUSOMP", tipoUsoMp);
   }

   public String getVerificaEst() {
        return this.getVo().asString("VERIFICAEST");
   }

   public void setVerificaEst(String verificaEst) {
        markAsChanged("VERIFICAEST", verificaEst);
   }

   public String getTipoQtd() {
        return this.getVo().asString("TIPOQTD");
   }

   public void setTipoQtd(String tipoQtd) {
        markAsChanged("TIPOQTD", tipoQtd);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getFixaQtdApo() {
        return this.getVo().asString("FIXAQTDAPO");
   }

   public void setFixaQtdApo(String fixaQtdApo) {
        markAsChanged("FIXAQTDAPO", fixaQtdApo);
   }

   public String getConsuRefUgo() {
        return this.getVo().asString("CONSUREFUGO");
   }

   public void setConsuRefUgo(String consuRefUgo) {
        markAsChanged("CONSUREFUGO", consuRefUgo);
   }

   public String getVinculoSeriePa() {
        return this.getVo().asString("VINCULOSERIEPA");
   }

   public void setVinculoSeriePa(String vinculoSeriePa) {
        markAsChanged("VINCULOSERIEPA", vinculoSeriePa);
   }

   public String getEstoqueTerceiro() {
        return this.getVo().asString("ESTOQUETERCEIRO");
   }

   public void setEstoqueTerceiro(String estoqueTerceiro) {
        markAsChanged("ESTOQUETERCEIRO", estoqueTerceiro);
   }

   public String getLiberaDesvio() {
        return this.getVo().asString("LIBERADESVIO");
   }

   public void setLiberaDesvio(String liberaDesvio) {
        markAsChanged("LIBERADESVIO", liberaDesvio);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public BigDecimal getCodUsuCad() {
        return this.getVo().asBigDecimal("CODUSUCAD");
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   public String getPropMpFixa() {
        return this.getVo().asString("PROPMPFIXA");
   }

   public void setPropMpFixa(String propMpFixa) {
        markAsChanged("PROPMPFIXA", propMpFixa);
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
        return this;
   }
}
