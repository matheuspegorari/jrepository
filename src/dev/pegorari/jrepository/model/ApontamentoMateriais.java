package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoMateriais extends AbstractSankhyaEntity<ApontamentoMateriais> {
   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getSeqApa() {
        return this.getVo().asBigDecimal("SEQAPA");
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public String getTipoUso() {
        return this.getVo().asString("TIPOUSO");
   }

   public void setTipoUso(String tipoUso) {
        markAsChanged("TIPOUSO", tipoUso);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public String getVinculoSeriePa() {
        return this.getVo().asString("VINCULOSERIEPA");
   }

   public void setVinculoSeriePa(String vinculoSeriePa) {
        markAsChanged("VINCULOSERIEPA", vinculoSeriePa);
   }

   public BigDecimal getSeqMp() {
        return this.getVo().asBigDecimal("SEQMP");
   }

   public void setSeqMp(BigDecimal seqMp) {
        markAsChanged("SEQMP", seqMp);
   }

   public BigDecimal getCodLocalBaixa() {
        return this.getVo().asBigDecimal("CODLOCALBAIXA");
   }

   public void setCodLocalBaixa(BigDecimal codLocalBaixa) {
        markAsChanged("CODLOCALBAIXA", codLocalBaixa);
   }

   public BigDecimal getCodMpe() {
        return this.getVo().asBigDecimal("CODMPE");
   }

   public void setCodMpe(BigDecimal codMpe) {
        markAsChanged("CODMPE", codMpe);
   }

   public BigDecimal getQtdMpe() {
        return this.getVo().asBigDecimal("QTDMPE");
   }

   public void setQtdMpe(BigDecimal qtdMpe) {
        markAsChanged("QTDMPE", qtdMpe);
   }

   public BigDecimal getQtdPerda() {
        return this.getVo().asBigDecimal("QTDPERDA");
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        markAsChanged("QTDPERDA", qtdPerda);
   }

   @Override
   public String getTableName() {
        return "TPRAMP";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoMateriais";
   }

   @Override
   public ApontamentoMateriais fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
