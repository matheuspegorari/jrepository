package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ManifestoPrazoPgtoFrete extends AbstractSankhyaEntity<ManifestoPrazoPgtoFrete> {
   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getParcela() {
        return this.getVo().asBigDecimal("PARCELA");
   }

   public void setParcela(BigDecimal parcela) {
        markAsChanged("PARCELA", parcela);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getSeqPgFre() {
        return this.getVo().asBigDecimal("SEQPGFRE");
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        markAsChanged("SEQPGFRE", seqPgFre);
   }

   public BigDecimal getSeqPraPgFre() {
        return this.getVo().asBigDecimal("SEQPRAPGFRE");
   }

   public void setSeqPraPgFre(BigDecimal seqPraPgFre) {
        markAsChanged("SEQPRAPGFRE", seqPraPgFre);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public Timestamp getVencimento() {
        return this.getVo().asTimestamp("VENCIMENTO");
   }

   public void setVencimento(Timestamp vencimento) {
        markAsChanged("VENCIMENTO", vencimento);
   }

   @Override
   public String getTableName() {
        return "TGFMDFPRAPGFRE";
   }

   @Override
   public String getEntityName() {
        return "ManifestoPrazoPgtoFrete";
   }

   @Override
   public ManifestoPrazoPgtoFrete fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
