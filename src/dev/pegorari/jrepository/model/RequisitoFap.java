package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RequisitoFap extends AbstractSankhyaEntity<RequisitoFap> {
   public String getCasoUso() {
        return this.getVo().asString("CASOUSO");
   }

   public void setCasoUso(String casoUso) {
        markAsChanged("CASOUSO", casoUso);
   }

   public BigDecimal getCodReq() {
        return this.getVo().asBigDecimal("CODREQ");
   }

   public void setCodReq(BigDecimal codReq) {
        markAsChanged("CODREQ", codReq);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   public String getTodaEtapa() {
        return this.getVo().asString("TODAETAPA");
   }

   public void setTodaEtapa(String todaEtapa) {
        markAsChanged("TODAETAPA", todaEtapa);
   }

   @Override
   public String getTableName() {
        return "TCSREQ";
   }

   @Override
   public String getEntityName() {
        return "RequisitoFap";
   }

   @Override
   public RequisitoFap fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
