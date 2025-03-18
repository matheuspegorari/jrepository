package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ManifestoPrazoPgtoFrete extends AbstractSankhyaEntity<ManifestoPrazoPgtoFrete> {
   private BigDecimal nuViag;
   private BigDecimal parcela;
   private BigDecimal seqMdfe;
   private BigDecimal seqPgFre;
   private BigDecimal seqPraPgFre;
   private BigDecimal valor;
   private Timestamp vencimento;

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getParcela() {
        return parcela;
   }

   public void setParcela(BigDecimal parcela) {
        markAsChanged("PARCELA", parcela);
        this.parcela = parcela;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getSeqPgFre() {
        return seqPgFre;
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        markAsChanged("SEQPGFRE", seqPgFre);
        this.seqPgFre = seqPgFre;
   }

   public BigDecimal getSeqPraPgFre() {
        return seqPraPgFre;
   }

   public void setSeqPraPgFre(BigDecimal seqPraPgFre) {
        markAsChanged("SEQPRAPGFRE", seqPraPgFre);
        this.seqPraPgFre = seqPraPgFre;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public Timestamp getVencimento() {
        return vencimento;
   }

   public void setVencimento(Timestamp vencimento) {
        markAsChanged("VENCIMENTO", vencimento);
        this.vencimento = vencimento;
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
        this.setOriginalVO(vo);
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.parcela = vo.asBigDecimal("PARCELA");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.seqPgFre = vo.asBigDecimal("SEQPGFRE");
        this.seqPraPgFre = vo.asBigDecimal("SEQPRAPGFRE");
        this.valor = vo.asBigDecimal("VALOR");
        this.vencimento = vo.asTimestamp("VENCIMENTO");
        return this;
   }
}
