package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvaliacaoRequisicao extends AbstractSankhyaEntity<AvaliacaoRequisicao> {
   public String getObsAvaliacao() {
        return this.getVo().asString("OBSAVALIACAO");
   }

   public void setObsAvaliacao(String obsAvaliacao) {
        markAsChanged("OBSAVALIACAO", obsAvaliacao);
   }

   public BigDecimal getCodMotivo() {
        return this.getVo().asBigDecimal("CODMOTIVO");
   }

   public void setCodMotivo(BigDecimal codMotivo) {
        markAsChanged("CODMOTIVO", codMotivo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuAvaliacao() {
        return this.getVo().asBigDecimal("NUAVALIACAO");
   }

   public void setNuAvaliacao(BigDecimal nuAvaliacao) {
        markAsChanged("NUAVALIACAO", nuAvaliacao);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public Timestamp getDhAvaliacao() {
        return this.getVo().asTimestamp("DHAVALIACAO");
   }

   public void setDhAvaliacao(Timestamp dhAvaliacao) {
        markAsChanged("DHAVALIACAO", dhAvaliacao);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   @Override
   public String getTableName() {
        return "TRSAVR";
   }

   @Override
   public String getEntityName() {
        return "AvaliacaoRequisicao";
   }

   @Override
   public AvaliacaoRequisicao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
