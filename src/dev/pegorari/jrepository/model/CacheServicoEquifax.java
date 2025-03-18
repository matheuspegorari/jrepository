package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CacheServicoEquifax extends AbstractSankhyaEntity<CacheServicoEquifax> {
   private String cgcCpf;
   private String cmc7;
   private BigDecimal codUsu;
   private Timestamp dhConsulta;
   private char[] resposta;
   private String tipConsulta;

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
        this.cgcCpf = cgcCpf;
   }

   public String getCmc7() {
        return cmc7;
   }

   public void setCmc7(String cmc7) {
        markAsChanged("CMC7", cmc7);
        this.cmc7 = cmc7;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhConsulta() {
        return dhConsulta;
   }

   public void setDhConsulta(Timestamp dhConsulta) {
        markAsChanged("DHCONSULTA", dhConsulta);
        this.dhConsulta = dhConsulta;
   }

   public char[] getResposta() {
        return resposta;
   }

   public void setResposta(char[] resposta) {
        markAsChanged("RESPOSTA", resposta);
        this.resposta = resposta;
   }

   public String getTipConsulta() {
        return tipConsulta;
   }

   public void setTipConsulta(String tipConsulta) {
        markAsChanged("TIPCONSULTA", tipConsulta);
        this.tipConsulta = tipConsulta;
   }

   @Override
   public String getTableName() {
        return "TGFEQX";
   }

   @Override
   public String getEntityName() {
        return "CacheServicoEquifax";
   }

   @Override
   public CacheServicoEquifax fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.cgcCpf = vo.asString("CGC_CPF");
        this.cmc7 = vo.asString("CMC7");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhConsulta = vo.asTimestamp("DHCONSULTA");
        this.resposta = vo.asClob("RESPOSTA");
        this.tipConsulta = vo.asString("TIPCONSULTA");
        return this;
   }
}
