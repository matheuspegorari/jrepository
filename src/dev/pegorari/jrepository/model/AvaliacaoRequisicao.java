package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvaliacaoRequisicao implements SankhyaEntity<AvaliacaoRequisicao> {

   private String obsAvaliacao;
   private BigDecimal codMotivo;
   private BigDecimal codUsu;
   private BigDecimal nuAvaliacao;
   private BigDecimal nuRequisicao;
   private Timestamp dhAvaliacao;
   private String status;

   public String getObsAvaliacao() {
        return obsAvaliacao;
   }

   public void setObsAvaliacao(String obsAvaliacao) {
        this.obsAvaliacao = obsAvaliacao;
   }

   public BigDecimal getCodMotivo() {
        return codMotivo;
   }

   public void setCodMotivo(BigDecimal codMotivo) {
        this.codMotivo = codMotivo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuAvaliacao() {
        return nuAvaliacao;
   }

   public void setNuAvaliacao(BigDecimal nuAvaliacao) {
        this.nuAvaliacao = nuAvaliacao;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        this.nuRequisicao = nuRequisicao;
   }

   public Timestamp getDhAvaliacao() {
        return dhAvaliacao;
   }

   public void setDhAvaliacao(Timestamp dhAvaliacao) {
        this.dhAvaliacao = dhAvaliacao;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   @Override
   public String getEntityName() {
        return "AvaliacaoRequisicao";
   }

   @Override
   public AvaliacaoRequisicao fromVO(DynamicVO vo) {
        this.obsAvaliacao = vo.asString("OBSAVALIACAO");
        this.codMotivo = vo.asBigDecimal("CODMOTIVO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuAvaliacao = vo.asBigDecimal("NUAVALIACAO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.dhAvaliacao = vo.asTimestamp("DHAVALIACAO");
        this.status = vo.asString("STATUS");
        return this;
   }
}
