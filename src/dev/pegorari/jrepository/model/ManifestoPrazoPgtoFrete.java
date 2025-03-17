package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ManifestoPrazoPgtoFrete implements SankhyaEntity<ManifestoPrazoPgtoFrete> {

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
        this.nuViag = nuViag;
   }

   public BigDecimal getParcela() {
        return parcela;
   }

   public void setParcela(BigDecimal parcela) {
        this.parcela = parcela;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getSeqPgFre() {
        return seqPgFre;
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        this.seqPgFre = seqPgFre;
   }

   public BigDecimal getSeqPraPgFre() {
        return seqPraPgFre;
   }

   public void setSeqPraPgFre(BigDecimal seqPraPgFre) {
        this.seqPraPgFre = seqPraPgFre;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public Timestamp getVencimento() {
        return vencimento;
   }

   public void setVencimento(Timestamp vencimento) {
        this.vencimento = vencimento;
   }

   @Override
   public String getEntityName() {
        return "ManifestoPrazoPgtoFrete";
   }

   @Override
   public ManifestoPrazoPgtoFrete fromVO(DynamicVO vo) {
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
