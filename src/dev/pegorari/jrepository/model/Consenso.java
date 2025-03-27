package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Consenso extends AbstractSankhyaEntity<Consenso> {
   public BigDecimal getNuAvaliacao() {
        return this.getVo().asBigDecimal("NUAVALIACAO");
   }

   public void setNuAvaliacao(BigDecimal nuAvaliacao) {
        markAsChanged("NUAVALIACAO", nuAvaliacao);
   }

   public BigDecimal getNuPesq() {
        return this.getVo().asBigDecimal("NUPESQ");
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuPesqConsenso() {
        return this.getVo().asBigDecimal("NUPESQCONSENSO");
   }

   public void setNuPesqConsenso(BigDecimal nuPesqConsenso) {
        markAsChanged("NUPESQCONSENSO", nuPesqConsenso);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuPesqAvaliado() {
        return this.getVo().asBigDecimal("NUPESQAVALIADO");
   }

   public void setNuPesqAvaliado(BigDecimal nuPesqAvaliado) {
        markAsChanged("NUPESQAVALIADO", nuPesqAvaliado);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getPlanoDeAcao() {
        return this.getVo().asString("PLANODEACAO");
   }

   public void setPlanoDeAcao(String planoDeAcao) {
        markAsChanged("PLANODEACAO", planoDeAcao);
   }

   @Override
   public String getTableName() {
        return "TPQCON";
   }

   @Override
   public String getEntityName() {
        return "Consenso";
   }

   @Override
   public Consenso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
