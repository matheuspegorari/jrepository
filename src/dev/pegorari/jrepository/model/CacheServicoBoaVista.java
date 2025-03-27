package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CacheServicoBoaVista extends AbstractSankhyaEntity<CacheServicoBoaVista> {
   public String getCgcCpf() {
        return this.getVo().asString("CGC_CPF");
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   public String getCmc7() {
        return this.getVo().asString("CMC7");
   }

   public void setCmc7(String cmc7) {
        markAsChanged("CMC7", cmc7);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhConsulta() {
        return this.getVo().asTimestamp("DHCONSULTA");
   }

   public void setDhConsulta(Timestamp dhConsulta) {
        markAsChanged("DHCONSULTA", dhConsulta);
   }

   public char[] getResposta() {
        return this.getVo().asClob("RESPOSTA");
   }

   public void setResposta(char[] resposta) {
        markAsChanged("RESPOSTA", resposta);
   }

   public String getTipConsulta() {
        return this.getVo().asString("TIPCONSULTA");
   }

   public void setTipConsulta(String tipConsulta) {
        markAsChanged("TIPCONSULTA", tipConsulta);
   }

   @Override
   public String getTableName() {
        return "TGFBOA";
   }

   @Override
   public String getEntityName() {
        return "CacheServicoBoaVista";
   }

   @Override
   public CacheServicoBoaVista fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
