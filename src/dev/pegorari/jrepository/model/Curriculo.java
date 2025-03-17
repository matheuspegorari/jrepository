package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Curriculo implements SankhyaEntity<Curriculo> {

   private BigDecimal nuCurriculoBt;
   private BigDecimal numCps;
   private String usoApAuditivo;
   private String veicProprio;
   private String numEnd;
   private String orgaOrg;
   private String pais;
   private String pis;
   private BigDecimal pretSalarial;
   private BigDecimal pretSalarialFinal;
   private BigDecimal pretSalarialInicial;
   private String ramal;
   private String rne;
   private String serieCps;
   private String sexo;
   private String sitPais;
   private String skype;
   private BigDecimal status;
   private String telCel;
   private String telCom;
   private String telPref;
   private String telRes;
   private BigDecimal tipDeficiencia;
   private String tipoEnd;
   private String twitter;
   private String uf;
   private BigDecimal ufCps;
   private BigDecimal anoChegPais;
   private String ativo;
   private String bairro;
   private String categoriaCnh;
   private String cep;
   private String cidade;
   private String cnh;
   private BigDecimal codTipParc;
   private String inApropriado;
   private BigDecimal codUsu;
   private String complEnd;
   private String consideracoes;
   private String cpf;
   private String defAuditivo;
   private String defFala;
   private String deficiente;
   private String defIndependente;
   private String defIntelectual;
   private String defOutras;
   private String defOutrosRecursos;
   private BigDecimal defRecursos;
   private BigDecimal defRecursosImpres;
   private String defVisual;
   private String descrDeficiencia;
   private String dispMudanca;
   private String dispViagem;
   private Timestamp dtAlter;
   private Timestamp dtInclusao;
   private Timestamp dtNasc;
   private Timestamp dtValCnh;
   private Timestamp dtValPais;
   private String email;
   private BigDecimal estadoCivil;
   private String estrangeiro;
   private String facebook;
   private byte[] foto;
   private String googlePlus;
   private BigDecimal grauInstr;
   private String identidade;
   private String inclusaoMge;
   private String indicacao;
   private String linkedin;
   private String naturalidade;
   private String nomeCandidato;
   private String nomeEnd;
   private BigDecimal nuCurriculo;
   private BigDecimal tipoCurriculo;
   private String deficienteF;

   public BigDecimal getNuCurriculoBt() {
        return nuCurriculoBt;
   }

   public void setNuCurriculoBt(BigDecimal nuCurriculoBt) {
        this.nuCurriculoBt = nuCurriculoBt;
   }

   public BigDecimal getNumCps() {
        return numCps;
   }

   public void setNumCps(BigDecimal numCps) {
        this.numCps = numCps;
   }

   public String getUsoApAuditivo() {
        return usoApAuditivo;
   }

   public void setUsoApAuditivo(String usoApAuditivo) {
        this.usoApAuditivo = usoApAuditivo;
   }

   public String getVeicProprio() {
        return veicProprio;
   }

   public void setVeicProprio(String veicProprio) {
        this.veicProprio = veicProprio;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
   }

   public String getOrgaOrg() {
        return orgaOrg;
   }

   public void setOrgaOrg(String orgaOrg) {
        this.orgaOrg = orgaOrg;
   }

   public String getPais() {
        return pais;
   }

   public void setPais(String pais) {
        this.pais = pais;
   }

   public String getPis() {
        return pis;
   }

   public void setPis(String pis) {
        this.pis = pis;
   }

   public BigDecimal getPretSalarial() {
        return pretSalarial;
   }

   public void setPretSalarial(BigDecimal pretSalarial) {
        this.pretSalarial = pretSalarial;
   }

   public BigDecimal getPretSalarialFinal() {
        return pretSalarialFinal;
   }

   public void setPretSalarialFinal(BigDecimal pretSalarialFinal) {
        this.pretSalarialFinal = pretSalarialFinal;
   }

   public BigDecimal getPretSalarialInicial() {
        return pretSalarialInicial;
   }

   public void setPretSalarialInicial(BigDecimal pretSalarialInicial) {
        this.pretSalarialInicial = pretSalarialInicial;
   }

   public String getRamal() {
        return ramal;
   }

   public void setRamal(String ramal) {
        this.ramal = ramal;
   }

   public String getRne() {
        return rne;
   }

   public void setRne(String rne) {
        this.rne = rne;
   }

   public String getSerieCps() {
        return serieCps;
   }

   public void setSerieCps(String serieCps) {
        this.serieCps = serieCps;
   }

   public String getSexo() {
        return sexo;
   }

   public void setSexo(String sexo) {
        this.sexo = sexo;
   }

   public String getSitPais() {
        return sitPais;
   }

   public void setSitPais(String sitPais) {
        this.sitPais = sitPais;
   }

   public String getSkype() {
        return skype;
   }

   public void setSkype(String skype) {
        this.skype = skype;
   }

   public BigDecimal getStatus() {
        return status;
   }

   public void setStatus(BigDecimal status) {
        this.status = status;
   }

   public String getTelCel() {
        return telCel;
   }

   public void setTelCel(String telCel) {
        this.telCel = telCel;
   }

   public String getTelCom() {
        return telCom;
   }

   public void setTelCom(String telCom) {
        this.telCom = telCom;
   }

   public String getTelPref() {
        return telPref;
   }

   public void setTelPref(String telPref) {
        this.telPref = telPref;
   }

   public String getTelRes() {
        return telRes;
   }

   public void setTelRes(String telRes) {
        this.telRes = telRes;
   }

   public BigDecimal getTipDeficiencia() {
        return tipDeficiencia;
   }

   public void setTipDeficiencia(BigDecimal tipDeficiencia) {
        this.tipDeficiencia = tipDeficiencia;
   }

   public String getTipoEnd() {
        return tipoEnd;
   }

   public void setTipoEnd(String tipoEnd) {
        this.tipoEnd = tipoEnd;
   }

   public String getTwitter() {
        return twitter;
   }

   public void setTwitter(String twitter) {
        this.twitter = twitter;
   }

   public String getUf() {
        return uf;
   }

   public void setUf(String uf) {
        this.uf = uf;
   }

   public BigDecimal getUfCps() {
        return ufCps;
   }

   public void setUfCps(BigDecimal ufCps) {
        this.ufCps = ufCps;
   }

   public BigDecimal getAnoChegPais() {
        return anoChegPais;
   }

   public void setAnoChegPais(BigDecimal anoChegPais) {
        this.anoChegPais = anoChegPais;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getBairro() {
        return bairro;
   }

   public void setBairro(String bairro) {
        this.bairro = bairro;
   }

   public String getCategoriaCnh() {
        return categoriaCnh;
   }

   public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public String getCidade() {
        return cidade;
   }

   public void setCidade(String cidade) {
        this.cidade = cidade;
   }

   public String getCnh() {
        return cnh;
   }

   public void setCnh(String cnh) {
        this.cnh = cnh;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   public String getInApropriado() {
        return inApropriado;
   }

   public void setInApropriado(String inApropriado) {
        this.inApropriado = inApropriado;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getComplEnd() {
        return complEnd;
   }

   public void setComplEnd(String complEnd) {
        this.complEnd = complEnd;
   }

   public String getConsideracoes() {
        return consideracoes;
   }

   public void setConsideracoes(String consideracoes) {
        this.consideracoes = consideracoes;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        this.cpf = cpf;
   }

   public String getDefAuditivo() {
        return defAuditivo;
   }

   public void setDefAuditivo(String defAuditivo) {
        this.defAuditivo = defAuditivo;
   }

   public String getDefFala() {
        return defFala;
   }

   public void setDefFala(String defFala) {
        this.defFala = defFala;
   }

   public String getDeficiente() {
        return deficiente;
   }

   public void setDeficiente(String deficiente) {
        this.deficiente = deficiente;
   }

   public String getDefIndependente() {
        return defIndependente;
   }

   public void setDefIndependente(String defIndependente) {
        this.defIndependente = defIndependente;
   }

   public String getDefIntelectual() {
        return defIntelectual;
   }

   public void setDefIntelectual(String defIntelectual) {
        this.defIntelectual = defIntelectual;
   }

   public String getDefOutras() {
        return defOutras;
   }

   public void setDefOutras(String defOutras) {
        this.defOutras = defOutras;
   }

   public String getDefOutrosRecursos() {
        return defOutrosRecursos;
   }

   public void setDefOutrosRecursos(String defOutrosRecursos) {
        this.defOutrosRecursos = defOutrosRecursos;
   }

   public BigDecimal getDefRecursos() {
        return defRecursos;
   }

   public void setDefRecursos(BigDecimal defRecursos) {
        this.defRecursos = defRecursos;
   }

   public BigDecimal getDefRecursosImpres() {
        return defRecursosImpres;
   }

   public void setDefRecursosImpres(BigDecimal defRecursosImpres) {
        this.defRecursosImpres = defRecursosImpres;
   }

   public String getDefVisual() {
        return defVisual;
   }

   public void setDefVisual(String defVisual) {
        this.defVisual = defVisual;
   }

   public String getDescrDeficiencia() {
        return descrDeficiencia;
   }

   public void setDescrDeficiencia(String descrDeficiencia) {
        this.descrDeficiencia = descrDeficiencia;
   }

   public String getDispMudanca() {
        return dispMudanca;
   }

   public void setDispMudanca(String dispMudanca) {
        this.dispMudanca = dispMudanca;
   }

   public String getDispViagem() {
        return dispViagem;
   }

   public void setDispViagem(String dispViagem) {
        this.dispViagem = dispViagem;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        this.dtInclusao = dtInclusao;
   }

   public Timestamp getDtNasc() {
        return dtNasc;
   }

   public void setDtNasc(Timestamp dtNasc) {
        this.dtNasc = dtNasc;
   }

   public Timestamp getDtValCnh() {
        return dtValCnh;
   }

   public void setDtValCnh(Timestamp dtValCnh) {
        this.dtValCnh = dtValCnh;
   }

   public Timestamp getDtValPais() {
        return dtValPais;
   }

   public void setDtValPais(Timestamp dtValPais) {
        this.dtValPais = dtValPais;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public BigDecimal getEstadoCivil() {
        return estadoCivil;
   }

   public void setEstadoCivil(BigDecimal estadoCivil) {
        this.estadoCivil = estadoCivil;
   }

   public String getEstrangeiro() {
        return estrangeiro;
   }

   public void setEstrangeiro(String estrangeiro) {
        this.estrangeiro = estrangeiro;
   }

   public String getFacebook() {
        return facebook;
   }

   public void setFacebook(String facebook) {
        this.facebook = facebook;
   }

   public byte[] getFoto() {
        return foto;
   }

   public void setFoto(byte[] foto) {
        this.foto = foto;
   }

   public String getGooglePlus() {
        return googlePlus;
   }

   public void setGooglePlus(String googlePlus) {
        this.googlePlus = googlePlus;
   }

   public BigDecimal getGrauInstr() {
        return grauInstr;
   }

   public void setGrauInstr(BigDecimal grauInstr) {
        this.grauInstr = grauInstr;
   }

   public String getIdentidade() {
        return identidade;
   }

   public void setIdentidade(String identidade) {
        this.identidade = identidade;
   }

   public String getInclusaoMge() {
        return inclusaoMge;
   }

   public void setInclusaoMge(String inclusaoMge) {
        this.inclusaoMge = inclusaoMge;
   }

   public String getIndicacao() {
        return indicacao;
   }

   public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
   }

   public String getLinkedin() {
        return linkedin;
   }

   public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
   }

   public String getNaturalidade() {
        return naturalidade;
   }

   public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
   }

   public String getNomeCandidato() {
        return nomeCandidato;
   }

   public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
   }

   public String getNomeEnd() {
        return nomeEnd;
   }

   public void setNomeEnd(String nomeEnd) {
        this.nomeEnd = nomeEnd;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        this.nuCurriculo = nuCurriculo;
   }

   public BigDecimal getTipoCurriculo() {
        return tipoCurriculo;
   }

   public void setTipoCurriculo(BigDecimal tipoCurriculo) {
        this.tipoCurriculo = tipoCurriculo;
   }

   public String getDeficienteF() {
        return deficienteF;
   }

   public void setDeficienteF(String deficienteF) {
        this.deficienteF = deficienteF;
   }

   @Override
   public String getEntityName() {
        return "Curriculo";
   }

   @Override
   public Curriculo fromVO(DynamicVO vo) {
        this.nuCurriculoBt = vo.asBigDecimal("NUCURRICULOBT");
        this.numCps = vo.asBigDecimal("NUMCPS");
        this.usoApAuditivo = vo.asString("USOAPAUDITIVO");
        this.veicProprio = vo.asString("VEICPROPRIO");
        this.numEnd = vo.asString("NUMEND");
        this.orgaOrg = vo.asString("ORGAORG");
        this.pais = vo.asString("PAIS");
        this.pis = vo.asString("PIS");
        this.pretSalarial = vo.asBigDecimal("PRETSALARIAL");
        this.pretSalarialFinal = vo.asBigDecimal("PRETSALARIALFINAL");
        this.pretSalarialInicial = vo.asBigDecimal("PRETSALARIALINICIAL");
        this.ramal = vo.asString("RAMAL");
        this.rne = vo.asString("RNE");
        this.serieCps = vo.asString("SERIECPS");
        this.sexo = vo.asString("SEXO");
        this.sitPais = vo.asString("SITPAIS");
        this.skype = vo.asString("SKYPE");
        this.status = vo.asBigDecimal("STATUS");
        this.telCel = vo.asString("TELCEL");
        this.telCom = vo.asString("TELCOM");
        this.telPref = vo.asString("TELPREF");
        this.telRes = vo.asString("TELRES");
        this.tipDeficiencia = vo.asBigDecimal("TIPDEFICIENCIA");
        this.tipoEnd = vo.asString("TIPOEND");
        this.twitter = vo.asString("TWITTER");
        this.uf = vo.asString("UF");
        this.ufCps = vo.asBigDecimal("UFCPS");
        this.anoChegPais = vo.asBigDecimal("ANOCHEGPAIS");
        this.ativo = vo.asString("ATIVO");
        this.bairro = vo.asString("BAIRRO");
        this.categoriaCnh = vo.asString("CATEGORIACNH");
        this.cep = vo.asString("CEP");
        this.cidade = vo.asString("CIDADE");
        this.cnh = vo.asString("CNH");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.inApropriado = vo.asString("INAPROPRIADO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.complEnd = vo.asString("COMPLEND");
        this.consideracoes = vo.asString("CONSIDERACOES");
        this.cpf = vo.asString("CPF");
        this.defAuditivo = vo.asString("DEFAUDITIVO");
        this.defFala = vo.asString("DEFFALA");
        this.deficiente = vo.asString("DEFICIENTE");
        this.defIndependente = vo.asString("DEFINDEPENDENTE");
        this.defIntelectual = vo.asString("DEFINTELECTUAL");
        this.defOutras = vo.asString("DEFOUTRAS");
        this.defOutrosRecursos = vo.asString("DEFOUTROSRECURSOS");
        this.defRecursos = vo.asBigDecimal("DEFRECURSOS");
        this.defRecursosImpres = vo.asBigDecimal("DEFRECURSOSIMPRES");
        this.defVisual = vo.asString("DEFVISUAL");
        this.descrDeficiencia = vo.asString("DESCRDEFICIENCIA");
        this.dispMudanca = vo.asString("DISPMUDANCA");
        this.dispViagem = vo.asString("DISPVIAGEM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        this.dtNasc = vo.asTimestamp("DTNASC");
        this.dtValCnh = vo.asTimestamp("DTVALCNH");
        this.dtValPais = vo.asTimestamp("DTVALPAIS");
        this.email = vo.asString("EMAIL");
        this.estadoCivil = vo.asBigDecimal("ESTADOCIVIL");
        this.estrangeiro = vo.asString("ESTRANGEIRO");
        this.facebook = vo.asString("FACEBOOK");
        this.foto = vo.asBlob("FOTO");
        this.googlePlus = vo.asString("GOOGLEPLUS");
        this.grauInstr = vo.asBigDecimal("GRAUINSTR");
        this.identidade = vo.asString("IDENTIDADE");
        this.inclusaoMge = vo.asString("INCLUSAOMGE");
        this.indicacao = vo.asString("INDICACAO");
        this.linkedin = vo.asString("LINKEDIN");
        this.naturalidade = vo.asString("NATURALIDADE");
        this.nomeCandidato = vo.asString("NOMECANDIDATO");
        this.nomeEnd = vo.asString("NOMEEND");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.tipoCurriculo = vo.asBigDecimal("TIPOCURRICULO");
        this.deficienteF = vo.asString("DEFICIENTEF");
        return this;
   }
}
